import React, { useState } from 'react'

const Ex3 = () => {
  let [isShow, setIsShow] = useState(true);
  return (
    <>
    <div>
      <h3>실습 3 버튼클릭으로 광고보기/숨기기</h3>
      <div>
        <button type="button" onClick={()=>{
          setIsShow(!isShow);
        }}>{isShow?"광고숨기기":"광고나타내기"}</button>
        <br />
        <br />
        {isShow?<div className="ad bg-red">오늘구매하시면 30% SALE!!!</div>:null}
      </div>
      </div>
    </>
  )
}

export default Ex3