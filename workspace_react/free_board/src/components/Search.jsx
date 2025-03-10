import axios from "axios";
import React, { useState } from "react";

const Search = () => {
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
  const sendData = () => {
    axios.get(`/api/boards?searchKeword=TITLE&searchValue=JAVA`)
    .then()
    .catch((error)=>console.log(error));
  };

  return (
    <>
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
          <button type="button">검색</button>
        </div>
      </div>
    </>
  );
};

export default Search;
