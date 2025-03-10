import axios from "axios";
import React, { useEffect, useState } from "react";

const DeptList = () => {
  const [deptList, setDeptList] = useState([]);
  const deptNo = 0;

  useEffect(() => {
    axios
      .get(`/api/dept`)
      .then((res) => {
        setDeptList(res.data);
      })
      .catch();
  });

  const deleteDept = () => {
    if (confirm("삭제할거니?")) {
      return;
    }
    axios
      .delete(`/api/dept/${deptNo}`)
      .then((res) => {
        alert("삭제완");
      })
      .catch();
  };
  return (
    <>
      <div className="tit-area">
        <h3>부서목록</h3>
      </div>
      <div className="cont-area">
        <div className="list-area">
          <table>
            <thead>
              <tr>
                <th>NO</th>
                <th>부서코드</th>
                <th>부서명</th>
                <th>관리</th>
              </tr>
            </thead>
            <tbody>
              {deptList.map((dept, i) => {
                <tr key={i}>
                  <td>{i}</td>
                  <td>{dept.deptNo}</td>
                  <td>{dept.deptName}</td>
                  <td>
                    <button
                      type="button"
                      onClick={() => {
                        deleteDept(dept.deptNo);
                      }}
                    >
                      삭제
                    </button>
                  </td>
                </tr>;
              })}
            </tbody>
          </table>
        </div>
      </div>
    </>
  );
};

export default DeptList;
