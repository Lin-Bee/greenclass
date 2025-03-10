import axios from 'axios';
import React, { useEffect, useState } from 'react'

const AxiosClass = () => {
  const [human,setHuman] = useState({  });
  
  useEffect(()=>{
    axios.get('/api/t4').
    then((res)=>{
      console.log('성공시');
      setHuman(res.data);
      // setHuman(
      //   {
      //   name:res.data.name,
      //   age:res.data.age,
      //   addr:res.data.addr
      //   }  
      // );
      console.log(res.data.name);
      console.log(res.data.age);
      console.log(res.data.addr);
    }).
    catch((error)=>{
      console.log('실패시시');
    });
  },[]);

  return (
    <>
      <h3>펄슨받아오기</h3>
      <p>이름: {human.name}</p>
      <p>나이: {human.age}</p>
      <p>주소: {human.addr}</p>
    </>
  )
}

export default AxiosClass