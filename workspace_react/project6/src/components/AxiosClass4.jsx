import React, { useEffect, useState } from "react";
import "../style/AxiosClass4.css";
import axios from "axios";

const AxiosClass4 = () => {
  const [personList, setPerson] = useState([]);
  const [studentList, setStudent] = useState([]);

  const getPersonList = (e) => {
    // 버튼누르면서버에서 학생데이터 가져오기
    axios
      .get("/api/t5")
      .then((res) => {
        console.log("연결 성공");
        setPerson(res.data);
      })
      .catch((error) => {
        console.log("연결 실패다제");
      });
  };

  const getStudentList = (e) => {
    axios
      .get("/api/t6")
      .then((res) => {
        console.log("연결 성공");
        setStudent(res.data);
      })
      .catch((error) => {
        console.log("연결 실패쓰");
      });
  };

  return (
    <>
      <h3>AxiosClass4</h3>

      <table className="t1">
        <tbody>
          <tr>
            <td>
              <button
                type="button"
                name="btn1"
                onClick={(e) => {
                  getPersonList(e);
                }}
              >
                버튼1
              </button>
            </td>
            <td>
              <button
                type="button"
                name="btn2"
                onClick={(e) => {
                  getStudentList(e);
                }}
              >
                버튼2
              </button>
            </td>
          </tr>
          <tr>
            <td>
              <table className="btn1-area">
                <thead>
                  <tr>
                    <th>NO</th>
                    <th>이름</th>
                    <th>나이</th>
                    <th>지역</th>
                  </tr>
                </thead>
                <tbody>
                  {personList.length === 0 ? (
                    <tr>
                      <td colSpan={4}>
                        상담 버튼을 클릭할 경우 내용이 나타납니다
                      </td>
                    </tr>
                  ) : (
                    personList.map((personCont, i) => {
                      return (
                        <tr key={i}>
                          <td>{i + 1}</td>
                          <td>{personCont.name}</td>
                          <td>{personCont.age}</td>
                          <td>{personCont.addr}</td>
                        </tr>
                      );
                    })
                  )}
                </tbody>
              </table>
            </td>
            <td>
              <table className="btn2-area">
                <thead>
                  <tr>
                    <th>이름</th>
                    <th>국어성적</th>
                    <th>영어성적</th>
                    <th>수학성적</th>
                    <th>총점</th>
                  </tr>
                </thead>
                <tbody>
                  {studentList.length === 0 ? (
                    <tr>
                      <td colSpan={5}>
                        상담 버튼을 클릭할 경우 내용이 나타납니다
                      </td>
                    </tr>
                  ) : (
                    studentList.map((studentCont, i) => {
                      let sumScore =
                        studentCont.korScore +
                        studentCont.engScore +
                        studentCont.mathScore;
                      return (
                        <tr key={i}>
                          <td>{studentCont.name}</td>
                          <td>{studentCont.korScore}</td>
                          <td>{studentCont.engScore}</td>
                          <td>{studentCont.mathScore}</td>
                          <td>{sumScore}</td>
                        </tr>
                      );
                    })
                  )}
                </tbody>
              </table>
            </td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default AxiosClass4;
