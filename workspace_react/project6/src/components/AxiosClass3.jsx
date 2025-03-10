import axios from 'axios';
import React, { useEffect, useState } from 'react'

const AxiosClass3 = () => {
  //첨부터 불러오니까 는 없는거 불러오니까 필요는 하네
  const [human,setHuman] = useState([]);

  //effect는 필요하긴함 th뿌려주고나서 td불러온다고 생ㄱ가하기
  useEffect(()=>{
    axios.get('/api/t5')
    .then((res)=>{
      console.log('불러와짐');
      console.log(res.data);
      console.log(res.data[0].name);
      setHuman(res.data);
    })
    .catch((error)=>{
      console.log('실패하심');
    });
  },[]);

  return (
    <>
      <br/>
      <br/>
      <table>
        <thead>
          <tr>
            <th>이름</th>
            <th>나이</th>
            <th>주소</th>
          </tr>
        </thead>
        <tbody>
          {
            human.map((hCont,i)=>{
              return (
                <tr key ={i}>
                <td>{hCont.name}</td>
                <td>{hCont.age}</td>
                <td>{hCont.addr}</td>
              </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  )
}

export default AxiosClass3