import React, { useState } from "react";

const Ex2 = (a) => {
  //만약 button을 클릭했을때
  let [displayTxt, toggleOnOff] = useState("ON");
  let [displayTxt2, toggleOffOn] = useState("OFF");

  //변수의 값이 on이면 off를 출력하고 버튼은 on으로
  //off이면 on를 출력하고 버튼은 off로 바꾸세요

  return (
    <>
      <div>
        <h3>실습 2 클릭할 때마다 ON/OFF 로 바뀌는 버튼과 글자</h3>
        <div>
          <p className="bg-red">{displayTxt}</p>
          <button type="button" onClick={() => {
             toggleOnOff(displayTxt==="ON"?"OFF":"ON");
             toggleOffOn(displayTxt2==="OFF"?"ON":"OFF");
            }}> {displayTxt2}
          </button>
        </div>
      </div>
    </>
  );
};

export default Ex2;
