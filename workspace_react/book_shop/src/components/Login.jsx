import React, { useState } from "react";
import ShopInput from "../common_component/ShopInput";
import ShopButton from "../common_component/ShopButton";
import styles from "./Login.module.css";
import * as userApi from "../apis/userApi";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const Login = ({setLoginInfo}) => {
  const nav = useNavigate();
  //기본고객정보셋팅용
  const [loginData, setLoginData] = useState({
    userId: "",
    userPw: ""
  });

  const writeInfo = (e) => {
    setLoginData({
      ...loginData,
      [e.target.name]: e.target.value
    });
  };

  /**
   * 여러 데이터를 전달하는 방법
    axios.get('url',{params:{key:value}}) 
    
    전달한 데이터는 객체 형식으로 전달

    위방식으로 전달한 데이터는 스프링에서
    1.@ RequestParam 어노테이션을 이용해서 받거나
    2. DTO 객체로 데이터를 받으면 된다.
    ※ 리액트 2번 - 23 PDF Query String으로 전달된 데이터를 받는 방식과 유사
   */

  const loginChk = () => {
      userApi.login(loginData)
      .then((res) => {
        console.log(res.data);
        if (res.data === '') {
          alert(`아이디 혹은 비밀번호가 맞지 않습니다`);
        } else {
          // setLoginData(res.data);
          alert(`어서오세요 ${res.data.userName}님`);
          //sessionStorage에 로그인하는 회원의 아이디, 이름, 권한 정보를 저장한다.
          sessionStorage.setItem('userId', res.data.userId);
          sessionStorage.setItem('userName', res.data.userName);
          sessionStorage.setItem('userRoll', res.data.userRoll);

          //로그인한 회원의 아이디, 이름, 권한 정보만 가진 객체 생성 
          const loginInfo = {
            userId : res.data.userId,
            userName : res.data.userName,
            userRoll: res.data.userRoll
          }
          //loginInfo 객체를 json(객체형태로 생긴 문자열)으로 변환
          //JSON.stringify 를 이용해서 필요한 값만받아옴

          sessionStorage.setItem('loginInfo',JSON.stringify(loginInfo));
          setLoginInfo(loginInfo);

          nav(loginInfo.userRoll === 'USER' ? '/' : '/admin/reg-item');
        }
      })
      .cathch((error) => {
        console.log(error);
      });
  };
      //  userApi
    //    .login({params:{age:20}})
    //   .then((res) => {
    //     console.log(res.data);
    //     if (userInfo.userId == res.data.userId) {
    //       setUserInfo(res.data);
    //       alert(`어서오세요 ${res.data.userName}님`);
    //       nav("/");
    //     } else {
    //       alert(`아이디 혹은 비밀번호가 맞지 않습니다`);
    //     }
    //   })
    //   .catch((error) => {console.log(error)});

  return (
    <>
      <div className={styles.login}>
        <h3>로그인</h3>

        <div className={styles.container}>
          <div>
            <p>아이디</p>
            <p>
              <ShopInput
                size="wide"
                name="userId"
                value={loginData.userId}
                onChange={(e) => {
                  writeInfo(e);
                }}
              />
            </p>
          </div>
          <div>
            <p>비밀번호</p>
            <p>
              <ShopInput
                size="wide"
                name="userPw"
                value={loginData.userPw}
                onChange={(e) => {
                  writeInfo(e);
                }}
              />
            </p>
          </div>
          <ShopButton
            title="로그인"
            onClick={(e) => {
              loginChk(e);
            }}
          />
        </div>
      </div>
    </>
  );
};

export default Login;
