import axios from "axios";
import React from "react";
import { useSearchParams } from "react-router-dom";

const QueryString = () => {
  //쿼리스트링으로 넘어오는 데이터 받기
  //배열의 첫번째 인자 :쿼리스트링으로 넘어오는 데이터(객체 형식)
  //배열의 두번째 인자 : 전달받은 데이터를 변경하는 함수
  const [params, setParams] = useSearchParams();
  console.log(params);

  const data1 = params.get("age");
  console.log(data1);
  const data2 = params.get("name");
  console.log(data2);

  const sendData = (e) => {
    axios.get(`/replys/test/?age=${data1}&&name=${data2}`).then().catch();
  };

  ///내가 지정한 주소?num=1&name=소리 < 변수값의 값

  return (
    <>
      <h3>쿼리연습</h3>
      <button
        type="button"
        onClick={() => {
          sendData();
        }}
      >
        데이터전송
      </button>
    </>
  );
};

export default QueryString;
