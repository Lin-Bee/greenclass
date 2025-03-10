import React, { useEffect, useState } from "react";
import Search from "./Search";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const List = () => {
  const nav = useNavigate();
  const [boardList, setBoardList] = useState([]);

  useEffect((e) => {
    axios
      .get("/api/boards")
      .then((res) => {
        console.log(res.data);
        setBoardList(res.data);
        console.log("불러옴");
      })
      .catch((error) => {
        console.log(error);
        console.log("불러오기 실패 ><");
      });
  }, []);

  return (
    <>
      <div className="tit-box">
        <h3>자유게시판</h3>
      </div>
      <Search />
      <div className="cont-area">
        <table>
          <thead>
            <tr>
              <th>NO</th>
              <th>제목</th>
              <th>작성자</th>
              <th>작성일</th>
              <th>조회수</th>
            </tr>
          </thead>
          <tbody>
            {boardList.map((boardCont, i) => {
              <tr>
                <td>{boardList.length - i}</td>
                <td>{boardCont.title}</td>
                <td>{boardCont.writer}</td>
                <td>{boardCont.regDate}</td>
                <td>{boardCont.readCnt}</td>
              </tr>;
            })}
          </tbody>
        </table>
        <div className="btn-area">
          <button type="button" onClick={
            nav('/write')
            }>
            글쓰기
          </button>
        </div>
      </div>
    </>
  );
};

export default List;
