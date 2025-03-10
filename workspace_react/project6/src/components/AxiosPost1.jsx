import axios from "axios";
import React from "react";

const AxiosPost1 = () => {
  //axios.post()함수를 통해 값을 받아올 경우
  //자바로 전달할 데이터를 두번째매개변수로 작성가능
  //자바로 전달할 데이터는 객체 형식으로 지정해야함{}
  axios.post("/api/t7", { name: "kim", age: 20 }).then().catch();
  axios.post("/api/t8", { name: "lee", age: 20 }).then().catch();

  return (
    <>
      <h3>AxiosPost1</h3>
      <p>axsio를 사용하여 서버에 데이터 전달하기</p>
    </>
  );
};

export default AxiosPost1;
