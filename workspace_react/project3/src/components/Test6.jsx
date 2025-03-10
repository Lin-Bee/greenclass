import React, { useState } from 'react'
import '../style/Test6.css';

const Test6 = () => {
  const [num,addNum] = useState(0);

  const changeCount = (val) => {
    addNum(num+(val));
  }

  return (
    <>
    <h3>실습6. -1, -10, -100, +100, +10, +1 각 버튼 클릭을 클릭하면 현재 카운트의 값을 변경하는 코드를 작성하세요</h3>
    <div className="graybox">
    <p>현재카운트</p>
    <p>현재 : {num}</p>
    </div>
    <div>
      <button type='button' onClick={()=>{changeCount(-1)}}>-1</button>
      <button type='button' onClick={()=>{changeCount(-10)}}>-10</button>
      <button type='button' onClick={()=>{changeCount(-100)}}>-100</button>
      <button type='button' onClick={()=>{changeCount(100)}}>+100</button>
      <button type='button' onClick={()=>{changeCount(10)}}>+10</button>
      <button type='button' onClick={()=>{changeCount(1)}}>+1</button>
      {/* <button type='button' onClick={()=>{addNum(num+(100));}}>+100</button>
      <button type='button' onClick={()=>{addNum(num+(10));}}>+10</button>
      <button type='button' onClick={()=>{addNum(num+(1));}}>+1</button> */}
    </div>
    </>
  )
}

export default Test6