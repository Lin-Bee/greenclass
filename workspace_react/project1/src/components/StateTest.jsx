import React, { useState } from 'react'

const StateTest = () => {
  //useState는 배열데이터이다
  //첫번째 데이터는 소괄호 안에 작성된 데이터를 리턴한다.
  //두번째 데이터는 f << 함수가 전달된다.
  console.log(3);
  let [nowState,changeState] = useState('취업준비중');
  // ^^^^   리액트는 구조분해할당을써서 이용함   ^^^^
  //변수의 값을 변경하는 기능을 가진 함수.
  console.log(nowState);
  console.log(changeState);

  //use state라고 하는 훅이 자동으로 생성됨 굿굿
  // class a{ 
  //   let nowState = '취뽀성공';
  //   public void changeState(String nowState){
  //       this.nowState = nowState;
  //   }
  // }
  
  // let hobby = '잠자기';
  
  return (
    <>
      <div>{nowState}</div>
      <button type='button' onClick={()=>{
         changeState('취뽀성공');
      }} >두근두근</button>
      

      <br />
      <br />
      <br />
      <br />

      {/* <div>{hobby}</div>
      <button type='button' onClick={()=>{hobby='공부하기';}} >공부하기로 취미변경</button> */}
    </>
  )
}

export default StateTest