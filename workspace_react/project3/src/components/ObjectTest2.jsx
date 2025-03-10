import React, { useState } from "react";

const ObjectTest2 = () => {
  const [monitor, setMonitor] = useState({
    brand: "samsung",
    price: 10000,
    color: "black",
  });

  return (
    <>
      <div>Object Test</div>
      <p>브랜드:{monitor.brand}</p>
      <p>가격:{monitor.price}</p>
      <p>색상:{monitor.color}</p>
      <button
        type="button"
        onClick={() => {
          //새로운 객체를 생성해야함
          // const copyMonitor = { ...monitor };
          // copyMonitor.brand = "lg";
          // setMonitor(copyMonitor);
          setMonitor({ ...monitor, brand: "lg" });
          //       monitor의 값을 쭉 받고, brand는 lg이다 라고 한번더 선언
          // 이는 monitor의 값을 중복선언한것으로 마지막 값이 적용되어 나타나는 현상이다
        }}
      >
        버튼입니다
      </button>
    </>
  );
};

export default ObjectTest2;
