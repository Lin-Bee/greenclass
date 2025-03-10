import React from "react";

const Map_2 = () => {
  const foodArr = ["짜장면", "탕수육", "짬뽕"];

  return (
    <>
      <ul>
        {foodArr.map((food, i) => {
          return <li key={i}>{food}</li>;
        })}
      </ul>
    </>
  );
};

export default Map_2;
