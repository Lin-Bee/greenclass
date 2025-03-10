import React from "react";
import "./Header.css";
import { Link, useNavigate } from "react-router-dom";

const Header = () => {
  const nav = useNavigate(); // link 대신 함수쓰기
  //useNavigate() hook 은 페이지 이동기능을 제공하는 함수리턴
  //그래서 nav랑 구분됨
  return (
    <>
      <header className="header">
        <div className="inner">
          <div className="flex">
            <h1>
              <Link to={""}>logo</Link>
            </h1>
            <nav>
              <ul>
                <li>
                  <span onClick={(e)=>{{nav('/login')}}}>로그인</span>
                </li>
                <li>
                <span onClick={(e)=>{{nav('/join')}}}>회원가입</span>
                </li>
                <li>
                  <button type="button" onClick={(e)=>{
                    nav('/my-page');
                  }}>
                    마이페이지로 이동
                  </button>
                </li>
              </ul>
            </nav>
          </div>
        </div>
      </header>
    </>
  );
};

export default Header;
