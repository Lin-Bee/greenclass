import React from 'react';
import '../style/map.css';


const Map_4 = () => {
  
  const studentList = [
    {
      name : '김자바',
      age : 20,
      korScore : 70,
      engScore : 80
    },
    {
      name : '이자바',
      age : 30,
      korScore : 90,
      engScore : 90
    },
    {
      name : '박자바',
      age : 40,
      korScore : 60,
      engScore : 100
    },
  ];

  return (
    <>
    <table>
      <colgroup>
        
      </colgroup>
      <thead>
      <tr>
        <th>NO</th>
        <th>이름</th>
        <th>나이</th>
        <th>국어성적</th>
        <th>영어성적</th>
      </tr>
      </thead>
      <tbody>
      {
        studentList.map((student,i)=>{
          return (
            <tr key={i}>
              <td>{i+1}</td>
              <td>{student.name}</td>
              <td>{student.age}</td>
              <td>{student.korScore}</td>
              <td>{student.engScore}</td>
            </tr>
          )
        })
      }
      </tbody>
    </table>
    </>
  )
}

export default Map_4