import axios from "axios";
import { useEffect, useState } from "react";

import React from "react";

const useEffect1 = () => {
  const [data, setData] = useState(0);

  useEffect(() => {
    //게또() 함수안에는 데이터를 요청할 경로작성(url)자바쓰
    axios
      .get("/api/t1") //< /api 에 localhost:8080 돌아가는중임
      .then((res) => {
        //매개변수를받아야댐
        console.log("데이터통신성공");
        console.log();
        console.log(res); //response : res 응답
        setData(res.data);
      }) //데이터 통신 성공후 실행내용
      .catch((error) => {
        console.log("데이터통신실패");
        console.log(error.data);
        console.log(error);
      }); // 데이터 통신 실패시내용
  }, []);

  return (
    <>
      <div>받은데이터:{data}</div>
      <br />
      <div>spring과함께하는 거지가튼 리액트</div>
      <div>CORS policy : 접근을막아바려따요</div>
      <div>cross-origin resuource sharing</div>
      <div>교차 출처 리소스 공유</div>
      <div>저거는 vite.config.js 파일을 수정해야함</div>
      <pre>
        {/* server:{
        proxy: {
          // 경로가 "/api" 로 시작하는 요청을 대상으로 proxy 설정
          '/api': {
            // 요청 전달 대상 서버 주소 설정
            target: 'http://localhost:8080',
            // 요청 헤더 host 필드 값을 대상 서버의 호스트 이름으로  변경
            changeOrigin: true,
            // 요청 경로에서 '/api' 제거
            rewrite: (path) => path.replace(/^\/api/, ''),
          }
        }
      } */}
      </pre>
    </>
  );
};

export default useEffect1;
