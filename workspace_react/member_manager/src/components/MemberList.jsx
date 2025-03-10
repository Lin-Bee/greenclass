import axios from "axios";
import React, { useEffect, useState } from "react";
import Join from "./Join";
import { Link, useNavigate } from "react-router-dom";

const MemberList = () => {
  const [memberList, setMemberList] = useState([]);
  const nav = useNavigate();

  useEffect((e) => {
    axios
      .get("/api/members")
      .then((res) => {
        console.log(res.data);
        console.log("뭔데");
        setMemberList(res.data);
      })
      .catch((error) => {
        console.log("안됨");
        console.log(error);
      });
  }, []);

  return (
    <>
      <h2>회원목록</h2>
      <table>
        <thead>
          <tr>
            <th>번호</th>
            <th>아이디</th>
            <th>회원명</th>
            <th>회원연락처</th>
            <th>회원가입일</th>
          </tr>
        </thead>
        <tbody>
          {memberList.map((memberCont, i) => {
            return (
              <tr key={i}>
                <td>{memberList.length - i}</td>
                <td
                  onClick={(e) => {
                    nav(`/detail/${memberCont.memId}`);
                  }}
                >
                  {memberCont.memId}
                </td>
                <td>
                  <Link to={`/detail/${memberCont.memId}`}>
                    {memberCont.memName}
                  </Link>
                </td>
                <td>{memberCont.memTell}</td>
                <td>{memberCont.joinDate}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
      <button
        type="button"
        onClick={(e) => {
          nav("/join");
        }}
      >
        회원등록
      </button>
    </>
  );
};

export default MemberList;
