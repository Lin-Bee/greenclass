import React, { useState } from "react";

const Input_3 = () => {
  const fruitList = [
    //name은 key와 동일하게 사용합니다.
    { text: "사과", name: "apple" },
    { text: "바나나", name: "banana" },
    { text: "오렌지", name: "orange" }
  ];
  //초기값은 여러 option들 중에 최초로 화면에 표현하고싶은
  // 옵션 태그의 밸류 속성 값으로 지정
  const [fruit, setFruit] = useState("banana");

  return (
    <>
      <div className="inner">
        <br/>
        <div className="tit-area">
          <h3 className="tit">과일아리아</h3>
        </div>
        <div className="cont-area">
          {/* fruit처럼 내가 변경하려는 값으로 해주려고 함 */}
           {/* <select name="" id="" value={fruit} onChange={
            (e)=>{setFruit(e.target.value);}
            }>
            <option value="apple" >사과</option>
            <option value="orange">오렌지</option>
            <option value="banana">바나나</option>
          </select> */}
          <br />
          <br/>
          <select name="" id="" value={fruit} onChange={
            (e)=>{setFruit(e.target.value);}
            }>
            {fruitList.map((fList, i) => {
              console.log(fList);
              return (
                <option value={fList.name} key={fList.name}>
                  {fList.text}
                </option>
              );
            })}
          </select>
        </div>
      </div>
    </>
  );
};

export default Input_3;
