import React, { useState } from "react";

const Test5 = () => {
  const [human, setHuman] = useState({
    name: "홍길동",
    age: 20,
    addr: "우리집을 우리집이라부르지못하는 외로운 부랑자",
  });

  const copyHuman = { ...human };
  // copyHuman(){
  //   name="홍두깨",
  //   age=50,
  //   addr="한강이보이는 집의주인이되었다"
  // }

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
        type="button"
        onClick={() => {
          copyHuman.name = "홍두깨";
          setHuman(copyHuman);
        }}
      >
        개명을하고
      </button>
      <button
        type="button"
        onClick={() => {
          copyHuman.age = 50;
          setHuman(copyHuman);
        }}
      >
        나이도바꿔버려
      </button>
      <button
        type="button"
        onClick={() => {
          copyHuman.addr = "한강이보이는 집의주인이되었다";
          setHuman(copyHuman);
        }}
      >
        집이생기는매직
      </button>
    </>
  );
};

export default Test5;
