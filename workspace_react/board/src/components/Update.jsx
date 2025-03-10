import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';

const Update = () => {
  const prams = useParams();
  const {boardNum} = prams;

  const [boardCont, setBoardCont] = useState();

  useEffect(()=>{
    axios.get(`/api/update/${boardNum}`)
    .then((res)=>{
      console.log('굿');
      setBoardCont(res.data);
    })
    .catch((error)=>{
      console.log(error);
      console.log('왜 안되는데');
    });
  });
  //일단땡겨오고 put으로 바꾸기를 할것이다

  return (
    <>
      <div className="tit-box">
        <h3>게시판 수정페이지</h3>
      </div>
      <div className="cont-area">
        <table>
          <tbody>
            <tr>
              <th>작성일</th>
              <td>{boardCont.regDate}</td>
              <th>작성자</th>
              <td>{boardCont.writer}</td>
            </tr>
            <tr>
            <th>제목</th>
            <td><input type="text" value={boardCont.title}/></td>
            </tr>
            <tr>
            <th>내용</th>
            <td><textarea name="" id="" value={boardCont.content}></textarea></td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  )
}

export default Update