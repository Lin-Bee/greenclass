import axios from 'axios'
import React, { useState } from 'react'

const DeptWrite = () => {
  const [deptData,setDeptData] = useState({
    deptName: ""
  });
  
  const changeDept = (e) => {
    setDeptData({
      ...deptData,
      [e.target.name] : e.target.value
    });
  }

  const addDept = () =>{
    axios.post(`/api/dept`,deptData)
    .then(res=>{
      console.log("보내기")
    })
    .catch()
  }
  return (
    <>
      <div className="tit-area"><h3>부서등록</h3></div>
        <div className="cont-area">
          <div className="write-area">
            <input type="text" name="deptName" value={deptData.deptName} onChange={(e)=>{changeDept(e)}}/><button type="button" onClick={(e)=>{addDept(e)}}>등록</button>
          </div>
        </div>
    </>
  )
}

export default DeptWrite