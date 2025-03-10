import React, { useEffect, useState } from "react";
import axios from "axios";
import ShopSelect from "../common_component/ShopSelect";
import ShopInput from "../common_component/ShopInput";
import * as userApi from "../apis/userApi";
import styles from "./UserJoin.module.css";
import { useNavigate } from "react-router-dom";

const UserJoin = () => {
  const nav = useNavigate();
  //에러메시지 셋팅용
  const [errorMsg, seterrorMsg] = useState({
    userId: "",
    userPw: "",
    userTel: "",
  });
  //기본고객정보셋팅용
  const [userInfo, setUserInfo] = useState({
    userId: "",
    userPw: "",
    userName: "",
    userEmail: "",
    userTel: "",
    userEmail1: "",
    userEmail2: "@gmail.com",
    userTel1: "010",
    userTel2: "",
    userTel3: "",
  });

  //이메일두개를 한값에 넣기
  useEffect(
    (e) => {
      setUserInfo({
        ...userInfo,
        userEmail: userInfo.userEmail1 + userInfo.userEmail2,
      });
    },
    [userInfo.userEmail1, userInfo.userEmail2]
  );

  //전화번호 세개를 한값에 넣기
  useEffect(
    (e) => {
      setUserInfo({
        ...userInfo,
        userTel: [userInfo.userTel1, userInfo.userTel2, userInfo.userTel3].join(
          "-"
        ),
      });
    },
    [userInfo.userTel1, userInfo.userTel2, userInfo.userTel3]
  );

  //신규 변경된 데이터 저장
  const newUserInfo = (e) => {
    setUserInfo({
      ...userInfo,
      [e.target.name]: e.target.value,
    });
  };

  //회원가입 전 유효성 검사
  const joinValidate = () => {
    let checkValid = 0;
    seterrorMsg((state) => {
      return {
        ...state,
        userId: "",
        userPw: "",
        userTel: "",
      };
    });
    //경고문구 별도 출력
    const regex_id = /^[A-Za-z0-9]{4,16}$/;
    const regex_tel = /^(01[0-9]-\d{3,4}-\d{4}|0[2-9]-\d{3,4}-\d{4})$/;
    const regex_pw =
      /^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$%^*])[A-Za-z\d!@#$%^*]{6,20}$/;

    if (!regex_id.test(userInfo.userId)) {
      checkValid = 1;
      seterrorMsg((state) => {
        return {
          ...state,
          userId:
            "사용불가능한 아이디입니다. (* 4~16자 이내의 영문대소문자,숫자만 사용가능합니다)",
        };
      });
    }
    if (!regex_pw.test(userInfo.userPw)) {
      checkValid = 1;
      seterrorMsg((state) => {
        return {
          ...state,
          userPw:
            "사용불가능한 비밀번호입니다. (* 6~20자 이내의 영문대소문자,숫자만 사용가능합니다)",
        };
      });
    }
    if (!regex_tel.test(userInfo.userTel)) {
      checkValid = 1;
      seterrorMsg((state) => {
        return { ...state, userTel: "숫자만 가능합니다만" };
      });
    }
    return checkValid;
  };

  //버튼 클릭시 회원가입진행
  const sendUserInfo = () => {
    if (joinValidate() === 0) {
      userApi
      .joinUser(userInfo)
        .then((res) => {
          //회원가입됬을때
          if(res.data === 1){
            alert(`${userInfo.userName} 님 가입완`);
            nav("/login");
          }else{
            seterrorMsg({
              ...errorMsg,
              userId:'안대안대 사용중인 아이디임'
            });
          } 
        })
        .catch((error) => console.log(error));
      console.log(userInfo);
    }
  };

  return (
    <>
      <div className={styles.join_area}>
        <h3>회원가입</h3>
        <table>
          <tbody>
            <tr>
              <th>회원아이디</th>
              <td>
                <ShopInput
                  name="userId"
                  value={userInfo.userId}
                  onChange={(e) => {
                    newUserInfo(e);
                  }}
                />
                {errorMsg.userId && (
                  <p className="error-warning">{errorMsg.userId}</p>
                )}
              </td>
            </tr>
            <tr>
              <th>비밀번호</th>
              <td>
                <ShopInput
                  type="text"
                  name="userPw"
                  value={userInfo.userPw}
                  onChange={(e) => {
                    newUserInfo(e);
                  }}
                />
                {errorMsg.userPw && (
                  <p className="error-warning">{errorMsg.userPw}</p>
                )}
              </td>
            </tr>

            <tr>
              <th>회원이름</th>
              <td>
                <ShopInput
                  name="userName"
                  value={userInfo.userName}
                  onChange={(e) => {
                    newUserInfo(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>이메일</th>
              <td>
                <p className="flex">
                  <ShopInput
                    type="text"
                    name="userEmail1"
                    value={userInfo.userEmail1}
                    onChange={(e) => {
                      newUserInfo(e);
                    }}
                  />

                  <ShopSelect
                    name="userEmail2"
                    value={userInfo.userEmail2}
                    onChange={(e) => {
                      newUserInfo(e);
                    }}
                  >
                    <option value="@gmail.com">@gmail.com</option>
                    <option value="@naver.com">@naver.com</option>
                    <option value="@daum.net">@daum.net</option>
                  </ShopSelect>
                </p>
              </td>
            </tr>
            <tr>
              <th>전화번호</th>
              <td>
                <p className="flex">
                  <ShopInput
                    type="text"
                    name="userTel1"
                    value={userInfo.userTel1}
                    onChange={(e) => {
                      newUserInfo(e);
                    }}
                  />
                  -
                  <ShopInput
                    type="text"
                    name="userTel2"
                    value={userInfo.userTel2}
                    onChange={(e) => {
                      newUserInfo(e);
                    }}
                  />
                  -
                  <ShopInput
                    type="text"
                    name="userTel3"
                    value={userInfo.userTel3}
                    onChange={(e) => {
                      newUserInfo(e);
                    }}
                  />
                </p>
                {errorMsg.userTel && (
                  <p className="error-warning">{errorMsg.userTel}</p>
                )}
              </td>
            </tr>
          </tbody>
        </table>
        <button
          type="button"
          className="btn btn-basic"
          onClick={() => {
            sendUserInfo();
          }}
        >
          회원가입
        </button>
      </div>
    </>
  );
};

export default UserJoin;
