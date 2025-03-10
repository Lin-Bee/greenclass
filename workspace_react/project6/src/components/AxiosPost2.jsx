import axios from "axios";
import React, { useEffect, useState } from "react";

const AxiosPost2 = () => {
  const [sum,setSum] = useState(0); //학생성적 리셋용

  const student = {
    name: "kim",
    korScore: 80,
    engScore: 70,
    mathScore: 90,
  };

  useEffect(()=>{
    axios.post("/api/t9", student).then((res)=>{setSum(res.data);}).catch();
  },[]);

    // const phone = {
  //   brand: "samsung",
  //   price: 10000,
  //   color: "red",
  // };

  // axios.post("/api/t8", phone)
  // .then((res)=>{res.data})
  // .catch((error)=>{error});

  //아래 코드의 결과 전달되는 데이터를 자바에서 받은후
  //전달된 국영수점수의 총점을 java에서 만들고
  //리액트로 총점을 가죠오세요

  return (
    <>
      <div>AxiosPost2</div>
      <p>학생양반의 총점 : {sum}</p>
    </>
  );
};

export default AxiosPost2;
