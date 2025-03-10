import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios = () => {
  //서버에서 받은 데이터를 저장할 state 변수 제작
  const [num,setNum] = useState(0);

  //서버에서데이터받기
  useEffect(()=>{ // 랜더여부를 조정하기위해 useEffect
    axios.get('/api/t2').
    //통신성공후 실행예정
    then((res)=>{//res는 통신성공에대한 정보가담긴 객체
      setNum(res.data); //통신성공시 res
    }). 
    //통신실패시 실행예정
    catch((error)=>{

    });
  },[]); //mount될때만 실행하세요를 위해서 빈배열 넣기

  return (
    <>
      <h3>데이터받기1</h3>
      <div>{num}</div>
    </>
  )
}

export default Axios