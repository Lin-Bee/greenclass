import React, { useState } from "react";
import Display from "./Display";
import Controller from "./Controller";

const Counter = () => {
  const [count, setCount] = useState(0);
  const changeCount = (num) => {
    setCount(count + num);
  };

  return (
    <>
      <h2>Simple Counter</h2>
      <Display count={count} />
      <Controller changeCount={changeCount} />
    </>
  );
};

export default Counter;
