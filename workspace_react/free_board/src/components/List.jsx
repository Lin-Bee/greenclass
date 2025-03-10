import React, { useEffect, useState } from "react";
import Search from "./Search";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import dayjs from "dayjs";

const List = () => {
  const nav = useNavigate();
  const [boardList, setBoardList] = useState([]);
  const [boardNum, setboardNum] = useState();

  useEffect(() => {
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

  //검색창에 입력한 데이터를 저장할 변수
  const [searchData, setSerarchData] = useState({
    searchKeword: "TITLE",
    searchValue: "",
  });

  const changeSearch = (e) => {
    setSerarchData({
      ...searchData,
      [e.target.name]: e.target.value,
    });
  };
  const searchList = () => {
    axios
      .get(
        `/api/boards?searchKeword=${searchData.searchKeword}&searchValue=${searchData.searchValue}`
      )
      .then((res) => {
        console.log(res);
        setBoardList(res.data);
      })
      .catch((error) => console.log(error));
  };

  return (
    <>
      <div className="tit-box">
        <h3>자유게시판</h3>
      </div>
      <div className="serch-area flex fd-rowerever">
        <div>
          <select
            name="searchKeword"
            value={searchData.searchKeword}
            id=""
            onChange={(e) => {
              console.log(searchData.searchKeword);
              changeSearch(e);
            }}
          >
            <option value="TITLE">제목</option>
            <option value="WRITER">작성자</option>
          </select>
          <input
            type="text"
            value={searchData.searchValue}
            name="searchValue"
            onChange={(e) => {
              console.log(searchData.searchValue);
              changeSearch(e);
            }}
          />
          <button type="button" onClick={(e) => searchList(e)}>
            검색
          </button>
        </div>
      </div>
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
            {boardList.length === 0 ? (
              <tr className="nodata">
                <td colSpan={5}>등록된 게시글이없습니다</td>
              </tr>
            ) : (
              boardList.map((boardCont, i) => {
                const day = dayjs(boardCont.regDate).format(`YYYY년 MM월 DD일`);
                return (
                  <tr key={i}>
                    <td>{boardList.length - i}</td>
                    <td
                      onClick={(e) => {
                        setboardNum(boardCont.boardNum);
                        console.log(boardNum);
                        nav(`/detail/${boardCont.boardNum}`);
                      }}
                    >
                      {boardCont.title}
                    </td>
                    <td>{boardCont.writer}</td>
                    <td>{day}</td>
                    <td>{boardCont.readCnt}</td>
                  </tr>
                );
              })
            )}
          </tbody>
        </table>
        <div className="btn-area">
          <button
            type="button"
            onClick={() => {
              nav("/write");
            }}
          >
            글쓰기
          </button>
        </div>
      </div>

      {/* <div className="query-area">
        <div>QueryString실습</div>
        <dl className="flex">
          <dt>나이</dt>
          <dd>
            <input
              type="text"
              value={info.age}
              name="age"
              onChange={(e) => {
                changeInfo(e);
              }}
            />
          </dd>
        </dl>
        <dl className="flex">
          <dt>이름</dt>
          <dd>
            <input
              type="text"
              value={info.name}
              name="name"
              onChange={(e) => {
                changeInfo(e);
              }}
            />
          </dd>
        </dl>
        <div className="btn-area">
          <button
            type="button"
            onClick={(e) => {
              nav(`/test?age=${info.age}&name=${info.name}`);
            }}
          >
            QueryString실행
          </button>
        </div>
      </div> */}
    </>
  );
};

export default List;
