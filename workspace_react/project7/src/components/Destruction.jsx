import React from "react";

const Destruction = () => {
  return (
    <>
      <br />
      <br />
      <div className="inner">
        <h2>구조분해할당(배열,객체)</h2>
        <div>
          <p>const arr = [1,2,3]; </p>
          <p>- arr이라는 배열이 123 이라는 값을 가졌을때</p>
          <br />
          <p>const [a,b,c] = arr;</p>
          <p>- abc라는 순서(key)를 지정해줌</p>
          <br />
          <p>
            사실상 a b c라는 키값과 123이라는 배열의 값이 들어옴
            console.log(`$&#123; a &#125; a를치면 1나옴`);
          </p>
          <p>그래서 아래처럼 name을 줘도되고 &#123; 키값, ex_a &#125; ㄱㄱ</p>
          <p>이것을 어디에 쓰긴... 걍 바디타이틀이나 헤드 타이틀 같은거에 쓰는거지뭐</p>
        </div>
      </div>
    </>
  );
};

export default Destruction;
