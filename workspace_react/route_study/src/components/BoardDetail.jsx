import React from "react";
import { useParams } from "react-router-dom";

//해당 컴포넌트가 실행될때 num이라는 이름으로 데이터 전달
//url parameter로 전달되는 데이터를 받을때는 useParams() 훅을 사용하여 받는다
//useParams()혹은 URL Parameter로 전달되는 데이터를 객체 형식으로 리턴
const BoardDetail = () => {
  const params = useParams();
  const {num,age} = params;
  console.log(params);
  return (
    <>
      <div className="inner">
        <h3>게시글 상세페이지</h3>
        <div>
          num:{num}
          age:{age}
        </div>
      </div>
    </>
  );
};

export default BoardDetail;
