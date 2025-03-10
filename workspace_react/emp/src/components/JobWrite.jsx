import axios from "axios";
import React, { useState } from "react";

const JobWrite = () => {
  const [jobData, setjobData] = useState({
    deptName: "",
  });

  const changeDept = (e) => {
    setjobData({
      ...jobData,
      [e.target.name]: e.target.value,
    });
  };

  const addDept = () => {
    axios
      .post(`/api/dept`, jobData)
      .then((res) => {
        console.log("보내기");
      })
      .catch();
  };
  return (
    <>
      <div className="tit-area">
        <h3>직급등록</h3>
      </div>
      <div className="cont-area">
        <div className="write-area">
          <input
            type="text"
            name="deptName"
            value={jobData.deptName}
            onChange={(e) => {
              changeDept(e);
            }}
          />
          <button
            type="button"
            onClick={(e) => {
              addDept(e);
            }}
          >
            등록
          </button>
        </div>
      </div>
    </>
  );
};

export default JobWrite;
