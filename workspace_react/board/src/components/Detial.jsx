import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';

const Detial = () => {
  const params = useParams();
  const { boardNum } = params;
  const [boardCont, setBoardCont] = useState();

  useEffect(()=>{
    axios.get(`/api/detail/${boardNum}`)
    .then((res)=>{
      console.log('불러와');
      console.log(res.data);
      setBoardCont(res.data);
    })
    .catch((error)=>{
      console.log(error);
      console.log('실패다');
    })
  
  });

  return (
    <>
      <div className="tit-box">
        <h3>게시판 상세페이지</h3>
      </div>
      <div className="cont-area">
        <table>
          <tbody>
            <tr>
              <th>작성일</th>
              <td>{boardCont.regDate}</td>
              <th>작성자</th>
              <td>{boardCont.writer}</td>
              <th>조회수</th>
              <td>{boardCont.readCnt}</td>
            </tr>
            <tr>
            <th>제목</th>
            <td>{boardCont.title}</td>
            </tr>
            <tr>
            <th>내용</th>
            <td><div><pre>{boardCont.content}</pre></div></td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  )
}

export default Detial