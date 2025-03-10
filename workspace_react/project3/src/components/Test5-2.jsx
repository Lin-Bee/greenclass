import React, { useState } from "react";

const Test5 = () => {
  const [human, setHuman] = useState({
    name: "홍길동",
    age: 20,
    addr: "우리집을 우리집이라부르지못하는 외로운 부랑자",
  });
  
  return (
    <>
      <h3>
        실습 5_ 버튼 클릭 시 정보 변경_이름, 나이, 주소 정보는 하나의 객체를
        사용하여 표한할 것
      </h3>
      <p>이름:{human.name}</p>
      <p>나이:{human.age}</p>
      <p>주소:{human.addr}</p>
      <button
        type="button" id = "iddes"
        onClick={(e) => {
          //이벤트 발생시 실행코드로 작성하는 함수의 매개변수로는
          //이벤트 객체를 전달받을 수 있다
          //이벤트와 관련된 모든 정보를 객체형태로 가지고있다.
          console.log(e);
          console.log(e.target); //이벤트가 발생한태그
          console.log(e.target.type);
          console.log(e.target.id);
          setHuman({...human, name : "홍두깨"})
        }}
      >
        개명을하고
      </button>
      <button
        type="button"
        onClick={(e) => {
          setHuman({...human, age : 50})
        }}
      >
        나이도바꿔버려
      </button>
      <button
        type="button"
        onClick={(e) => {
          setHuman({...human, addr : "한강이보이는 집의주인이되었다"})
        }}
      >
        집이생기는매직
      </button>
    </>
  );
};

export default Test5;
