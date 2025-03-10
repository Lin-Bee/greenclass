import React, { useState } from "react";

const Input_1 = () => {
  //input태그의 value 값을 저장할 state변수
  const [data, setData] = useState('');

  return (
    <>
      <div className="inner">
        <div className="tit-area">
          <h2 className="tit">input태그에 데이터 입력받기</h2>
        </div>
        <div>
          {/* input에 작성한 값이 value속성이된다. */}
          <input type="text" className="long" value={data} onChange={(e)=>{
            //console.log(e.target.value); 
            setData(e.target.value); //이벤트가 발생한 태그 e.target 의 밸류
            }}/>
        </div>
        <div><p className="bold">input태그에 입력한 내용 : </p>{data}</div>
      </div>
    </>
  );
};

export default Input_1;
