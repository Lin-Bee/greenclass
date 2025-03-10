import axios from "axios";
import React, { useEffect, useState } from "react";
import { getCategoryList } from "../apis/BookApi";

// 상품 등록 컴포넌트
//도서명 input
//가격 input
//출판사 input
//책 소개 textarea
//카테고리코드 select
const ItemForm = () => {
  //카테고리 목록을 저장할 변수
  const [cateList, setCateList] = useState([]);

  //input 태그들에 입력한 데이터를 저장하는 변수
  const [bookData, setBookData] = useState({
    cateCode: 1,
    bookName: "",
    bookPrice: 0,
    publisher: "",
    bookInfo: "",
  });

  //카테고리 목록 조회
  useEffect(() => {
    getCategoryList()
      .then((res) => {
        console.log(res.data);
        setCateList(res.data);
      })
      .catch();
  }, []);

  //값 입력 시 반복 실행되는 함수
  const changeBookData = (e) => {
    setBookData({
      ...bookData,
      [e.target.name]: e.target.value,
    });
  };

  //등록 버튼 클릭 시 도서 등록 실행
  const regBook = () => {
    axios
      .post("/api/books", bookData)
      .then((res) => {
        alert("성공");
      })
      .catch((error) => console.log(error));
  };

  return (
    <div className="item-form-container">
      <div>도서 등록</div>
      <div>
        <div>
          <p>카테고리</p>
          <select
            name="cateCode"
            value={bookData.cateCode}
            onChange={(e) => changeBookData(e)}
          >
            {cateList.map((cate, i) => {
              return (
                <option key={i} value={cate.cateCode}>
                  {cate.cateName}
                </option>
              );
            })}
          </select>
        </div>
        <div>
          <p>도서명</p>
          <input
            type="text"
            name="bookName"
            value={bookData.bookName}
            onChange={(e) => changeBookData(e)}
          />
        </div>
        <div>
          <p>출판사</p>
          <input
            type="text"
            name="publisher"
            value={bookData.publisher}
            onChange={(e) => changeBookData(e)}
          />
        </div>
        <div>
          <p>도서 가격</p>
          <input
            type="text"
            name="bookPrice"
            value={bookData.bookPrice}
            onChange={(e) => changeBookData(e)}
          />
        </div>
        <div>
          <p>책 소개</p>
          <textarea
            name="bookInfo"
            value={bookData.bookInfo}
            onChange={(e) => changeBookData(e)}
          ></textarea>
        </div>
      </div>
      <div>
        <button type="button" onClick={(e) => regBook()}>
          등 록
        </button>
      </div>
    </div>
  );
};

export default ItemForm;
