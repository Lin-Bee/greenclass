import '../styles/Ex1.css';
import React, { useState } from 'react'

const Ex1 = () => {
  let [count, setCount] = useState(0);
  //let [기본, 셋팅할함수] = useState(기본값설정);
  //배열에 넣을때 하는 구조분해할당을통한 함수
  return (
    <>
      <div>
        <h3>실습1.클릭 횟수를 화면에 나타내는 코드 작성</h3>
        <p className='bg-red'>{count}</p>
        <button type='button' onClick={()=>{
          setCount(count+1);
        }}>클릭</button>
      </div>
    </>
  )
}

export default Ex1 