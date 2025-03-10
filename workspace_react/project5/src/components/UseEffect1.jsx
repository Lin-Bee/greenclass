import { useEffect, useState } from 'react'
import React from 'react'

const UseEffect1 = () => {
  const [cnt,setCnt] = useState(0);
    //useEffect는 컴포넌트의 생애주기에맞춰 특정 기능을 실행할때 사용
    //useEffect는 매개변수로 2개의 데이터를 가짐
    //첫번째 매개변수 : 실행할 내요을 작성, 화살표함수로 표현
    //두번째 매개변수 : 의존성 배열, 두번째매개변수는 필요할때만 사용
  
    //component가 moint 될때 +update될때 실행하는 코드
    useEffect(()=>{
      console.log('2.useEffect 안에이써용');
    });
    //useEffect는 실행시점의 차이가 있다
    console.log('1.useEffect 밖에이써용');  // 2,1 순으로 작성됨
  
    return (
      <>
        <div>useEffect</div>
        <p> useEffect 안의코드는렌더링후(html로화면다그린후) 실행된다.</p>
        <pre>
          - useEffect는 컴포넌트의 생애주기에맞춰 특정 기능을 실행할때 사용
          - useEffect는 매개변수로 2개의 데이터를 가짐
          - 첫번째 매개변수 : 실행할 내요을 작성, 화살표함수로 표현
          - 두번째 매개변수 : 의존성 배열, 두번째매개변수는 필요할때만 사용
        </pre>
  
        <button type="button" onClick={(e)=>{
          setCnt(cnt+1);
        }}>버튼</button>

        <br />
        <br />
        <hr />
        <br />
        <br />
      </>
    )
}

export default UseEffect1