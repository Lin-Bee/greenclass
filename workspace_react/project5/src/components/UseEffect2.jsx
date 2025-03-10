import React, { useEffect, useState } from 'react'

const UseEffect2 = () => {
  const [cnt1,setCnt1] = useState(0);
  const [cnt2,setCnt2] = useState(0);
  //useEffect 에 두번째 매개변수를 잘 활용할 경우 update시의 리런더 실행시점여부확인가능
  //의존선 배ㅕㅇ
  //의존성 배열을 ㅇ떻게 작성하느냐에 따라 useEffect의 리렌더링 시점의 실행여부 결정
  useEffect(()=>{
    console.log(5);
  },[]);
  //,[]오.... 둘의차이
  useEffect(()=>{
    console.log('cnt1값변경');
  },[cnt1]);
  //빈배열로 설정할 경우에는 > mount될때만 실행

  useEffect(()=>{
    console.log('cnt2값변경');
  },[cnt2]);

  useEffect(()=>{
    console.log('cnt1+2값변경');
  },[cnt2,cnt1]);

  return (
    <>
    <div className="react">react</div>
    <button type='button' onClick={(e)=>{setCnt1(cnt1+1)}}>cnt1 버튼입니다만</button>
    <p>5는 빈배열이라서 mount될때만 실행하므로 버튼 1을 누르면 2만 증가함</p>
    <br/>
    <button type='button' onClick={(e)=>{setCnt2(cnt2+1)}}>cnt2 버튼</button>
    <p>cnt2가 배열에 있어서 cnt2가 실행할때움직임</p>
    <br/>
    <br/>
    <p>useEffect는 각각의 아이들이 배열에 들어가있으면 특정 값이 바뀔때만 실행함</p>
    </>
  )
}

export default UseEffect2