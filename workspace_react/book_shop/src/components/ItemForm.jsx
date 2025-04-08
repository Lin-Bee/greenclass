import axios from "axios";
import React, { useEffect, useState } from "react";
import { getCategoryList, insertBook } from "../apis/BookApi";

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

  //첨부파일(책이미지. 상세) 저장하는 두가지 방법
  //1. 저장할 변수를 2개 만든다 (1번 진행) ★/ 2. 저장할변수 1개만들어서 2개 넣기
  //메인이미지 저장변수
  const [mainImg, setMainImg] = useState(null);

  //상세이미지 저장변수
  const [subImg, setSubImg] = useState(null);

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
    const regForm = new FormData(); //도서 등록시 (db에 insert시) 필요한 데이터 적재
    regForm.append("cateCode", bookData.cateCode);
    regForm.append("bookName", bookData.bookName);
    regForm.append("bookPrice", bookData.bookPrice);
    regForm.append("publisher", bookData.publisher);
    regForm.append("bookInfo", bookData.bookInfo);

    //첨부파일 데이터 적재
    regForm.append("mainImg", mainImg);
    regForm.append("subImg", subImg);
    //book을 받아오므로 가능
    //insertBook(regForm)
    insertBook(regForm)
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
        <div>
          <p>도서 표지 이미지</p>
          <input type="file" onChange={(e) => setMainImg(e.target.files[0])} />
        </div>
        <div>
          <p>도서 상세 이미지</p>
          <input type="file" onChange={(e) => setSubImg(e.target.files[0])} />
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
