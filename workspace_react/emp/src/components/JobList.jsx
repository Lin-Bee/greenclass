import axios from "axios";
import React, { useEffect, useState } from "react";

const JobList = () => {
  const [jobList, setjobList] = useState([]);
  const jobNo = 0;

  useEffect(() => {
    axios
      .get(`/api/job`)
      .then((res) => {
        setjobList(res.data);
      })
      .catch();
  });

  const deleteDept = () => {
    if (confirm("삭제할거니?")) {
      return;
    }
    axios
      .delete(`/api/dept/${jobNo}`)
      .then((res) => {
        alert("삭제완");
      })
      .catch();
  };
  return (
    <>
      <div className="tit-area">
        <h3>직급목록</h3>
      </div>
      <div className="cont-area">
        <div className="list-area">
          <table>
            <thead>
              <tr>
                <th>NO</th>
                <th>직급코드</th>
                <th>직급</th>
                <th>관리</th>
              </tr>
            </thead>
            <tbody>
              {jobList.map((job, i) => {
                <tr key={i}>
                  <td>{i}</td>
                  <td>{job.jobNo}</td>
                  <td>{job.jobName}</td>
                  <td>
                    <button
                      type="button"
                      onClick={() => {
                        deleteDept(job.jobNo);
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

export default JobList;
