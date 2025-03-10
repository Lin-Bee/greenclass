import axios from "axios";
import React, { useEffect, useState } from "react";

const AxiosClass2 = () => {
  const [human, setHuman] = useState({});
  const getHuman = () =>{
    //axios는 서버에서 데이터받을때 사용
    axios.get("/api/t4")
    .then((res) => {
      console.log("성공시");
      console.log(res.data);
      setHuman(res.data);
    })
    .catch((error) => {
      console.log("실패시시");
    });
  }
  //userEffect는 특정 생애주기에 기능을 구현할대 사용
  // ▲ ▲ ▲ 서버에서받을때 오래걸림 ▲ ▲ ▲
  return (
    <>
      <h3>펄슨받아오기</h3>
      <input
        type="button"
        onClick={(e) => {
          getHuman();
        }}
        label="자료받아오기"
        value="자료받아오기"
      />
        
      <p>이름: {human.name}</p>
      <p>나이: {human.age}</p>
      <p>주소: {human.addr}</p>
    </>
  );
};

export default AxiosClass2;
