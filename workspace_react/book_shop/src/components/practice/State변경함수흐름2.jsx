import React, { useEffect, useState } from "react";

/* 
  - state변경 함수는 인자로는 데이터, 함수가 전달된다.
  - state변경 함수의 인자로 전달되는 함수를 updater라 부른다
  - 인자로 함수를 사용하면항상 최신의 state값을 전달받을 수 있음
  - updater를 사용한 state변경함수는
    state변경 함수가 2회 연속 진행되면서 2번째 state변경함수의 기능이
    첫번째 state변경 함수의 결과에 의존적일때
*/
const State변경함수흐름2 = () => {
  const [num, setNum] = useState(0);
  const changeNum = () => {
    // setNum(num+1);
    // setNum(num+1);
    // setNum(num+1); 결과 num = 1

    //매개변수 : state변수의 값. 이값은 항상 최신의 값을 유지
    //함수의 return값을 state변수의 값으로 업데이트시켜준다
    //아래처럼 코드를 작성한다고 해도 여전히 보동기로 동작
    setNum((state) => {
      return state + 1;
    });
    setNum((state) => {
      return state + 1;
    });
    setNum((state) => {
      return state + 1;
    });

    console.log("a=", num);
  };

  useEffect(() => {
    changeNum();
  }, []);

  console.log("b=", num);

  useEffect(() => {
    console.log();
  });

  return (
    <>
      <h3>변경함수흐름2</h3>
    </>
  );
};

export default State변경함수흐름2;
