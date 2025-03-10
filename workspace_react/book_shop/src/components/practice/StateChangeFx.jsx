import React, { useEffect, useState } from 'react'

const StateChangeFx = () => {
  const [num1,setNum1] = useState(0);
  const [num2,setNum2] = useState(0);

  useEffect(()=>{
    console.log(num1);
    setNum1(num1+1);
    console.log(num1);
  },[]);  

  console.log('리렌더!');

  

  return (
    <>
      <div>변경함수 흐름</div>
      <h3>num1 = {num1}</h3>
      <h3>num2 = {num2}</h3>
    </>
  )
}

export default StateChangeFx