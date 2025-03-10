import React from "react";

const Header = (props) => {
  const title = "Header";
  return (
    <>
      <div className="area-ck">{title}영역시작~</div>
      <div className="inner">
        <header>
          <h1>logo</h1>
        </header>
        <div>
          <p>props는 객체의형태이다</p>
          <p>props.name(header가 가진 name) : {props.name} </p>
          <p>부모로 부터 받은 가상의 props 타입을 알맞게 사용하기</p>
          <br />
          <p>props.hobby(header가 가진 hobby) : {props.hobby}</p>
          <p>부모로 부터 받은 가상의 props 타입을 알맞게 사용하기</p>
          <br />
        </div>
      </div>
      <div className="area-ck">{title}영역끗~</div>
    </>
  );
};

export default Header;
