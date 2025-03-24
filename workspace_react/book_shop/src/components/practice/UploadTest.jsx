import axios from "axios";
import React, { useState } from "react";

//첨부파일과 관련되어잇는 것입니다.
//첨부파일의 경우 디비에 저장하면 디비 터짐 ㅠ
//우리의 소중한 디비를 지키기위한 매지컬한 저장법

const UploadTest = () => {
  //첨부파일 input 태그에서 선택한 파일을 저장할 변수
  const [firstFile, setFirstFile] = useState(null);

  const [multiFile, setMultiFile] = useState(null);

  //자바로 데이터를 전달할때 문자뿐만아니라 파일 데이터도 가져간다는것을 설정
  //post의 3번째 매개변수로 fileConfig를전달(★☆★☆이거해야 첨부됨★☆★☆)
  const fileConfig = { header: { "Content-Type": "multipart/form-data" } };

  //첨부파일 데이터를 자바로 전달하기 위해서는 FormData()객체를 사용해야함
  //form 데이터 객체 생성 : 데이터를 자바로 넘기는 객체

  const sendFile = () => {
    const form = new FormData();
    //첨부파일데이터를 자바로 전달하기 위한 form데이터 객체 생성
    form.append("bookName", "hong");
    form.append("bookPrice", 20);
    form.append("firstFile", firstFile);
    //post()메서드의 세번째 매개변수로 fileconfig선언해야함
    axios
      .post(
        "/api/test/upload1", //controller uri 표시
        form,
        fileConfig //그 형식을 지정해줌
      ) //파일을 받는 형식을설정 -> 일반적으로는 문자자체로 해석
      .then()
      .catch();
  };

  const sendFile2 = () => {}

  return (
    <>
      {/* 얘가 아니어도 파일은 배열형태긴함 */}
      <div>
        <input
          type="file"
          onChange={(e) => {
            console.log(e.target.files[0]);
            setFirstFile(e.target.files[0]);
          }}
        />
      </div>

      <button
        type="button"
        onClick={() => {
          sendFile();
        }}
      >
        파일전송1
      </button>

      <div>
        <input
          multiple //한번에 여러 파일 선택가능
          type="file"
          name=""
          required="" //기본값 false
          onChange={(e) => {
            console.log(e.target.files[0]);
            setMultiFile(e.target.files[0]);
          }}
        />
      </div>

      <button
        type="button"
        onClick={() => {
          sendFile2();
        }}
      >
        파일전송2
      </button>
    </>
  );
};

export default UploadTest;
