import React, { useState } from "react";

const Ex4 = () => {
  let [cntArr, cntUp] = useState([0, 0, 0]);
  const copyCntArr = [...cntArr]; // cntArr은 가능하면 기존값은 건드리지 않게 하기위해서
  //copy사이트를 하나 만들어준 후에 만들어진 사이트를 활용한다.
  //스프레드연산자를이용해 뿌려준 후에 이용해준다.
  function changeData(index){
    copyCntArr[index] = copyCntArr[index]+ 1
    cntUp(copyCntArr);
  }
  return (
    <>
      <h3>
        실습4 숫자를 클릭하면 클릭한 숫자만 1씩증가 <br /> 세 수는 하나의 배열을
        사용할 것
      </h3>
      <div className="flex">
        <span
          className="bg-red"
          onClick={() => {
            changeData(0);
          }}>
          {cntArr[0]}
        </span>
        <span
          className="bg-red"
          onClick={() => {
            changeData(1);
          }}>
          {cntArr[1]}
        </span>
        <span
          className="bg-red"
          onClick={() => {
            changeData(2);
          }}>
          {cntArr[2]}
        </span>
        
      </div>
    </>
  );
};

export default Ex4;
