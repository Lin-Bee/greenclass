import React, { useState } from 'react'

const User = () => {
  const [users,setUsers]=useState({
    name:'',
    email:'',
    password:'',
    major:'',
    gender:'',
    inter:[],
    selfy:'',
  });

  const setUsersInfo=(e)=>{
    setUsers({
      ...users,
      [e.target.name]:e.target.value
    });
  }

  const interList=['마라탕','짬뽕','샤브샤브','소고기'];
    

  return (
    <>
    <table className='full'>
      <tbody>
        <tr>
          <th>이름</th>
          <td><input type="text" name="name" value={users.name} onChange={(e)=>{
            setUsersInfo(e);
          }}/></td>
        </tr>
        <tr>
          <th>이메일</th>
          <td><input type="email" name="email" value={users.email} onChange={(e)=>{
            setUsersInfo(e);
          }}/></td>
        </tr>
        <tr>
          <th>비밀번호</th>
          <td><input name="password" type="password" value={users.password} onChange={(e)=>{
            setUsersInfo(e);
          }}/></td>
        </tr>
        <tr>
          <th>학과</th>
          <td>
            <select name="major" id="" value={users.major} onChange={(e)=>{setUsersInfo(e);}}>
              <option value="고기먹는학과">고기먹는학과</option>
              <option value="야채먹는학과">야채먹는학과</option>
              <option value="안먹는학과">안먹는학과</option>
              <option value="다먹는학과">다먹는학과</option>
            </select>
          </td>
        </tr>
        <tr>
          <th>성별</th>
          <td>
            <input type="radio" name="gender" value="여" checked={users.gender==='여'}
              onChange={(e)=>{setUsersInfo(e);}}
            />여
            <input type="radio" name="gender" value="남" checked={users.gender==='남'}
            onChange={(e)=>{setUsersInfo(e);}}
            />남
          </td>
        </tr>
        <tr>
          <th>관심사</th>
          <td>
            {interList.map((interList,i)=>{
              return (
                <input type="checkbox" name="inter" value={interList} key={i}
                 onChange={(e)=>{setUsersInfo(e);}}  label={interList}/> 
              )
            })}
          </td>
        </tr>
        <tr>
          <th>자기소개</th>
          <td><textarea name="selfy" id="" value={users.selfy} onChange={(e)=>{
            setUsersInfo(e);
          }}></textarea></td>
        </tr>
      </tbody>
    </table>
    <br/>
    <br/>
    <table className='full'>
      <tbody>
        <tr>
          <th>이름</th>
          <td>{users.name}</td>
        </tr>
        <tr>
          <th>이메일</th>
          <td>{users.email}</td>
        </tr>
        <tr>
          <th>비밀번호</th>
          <td>{users.password}</td>
        </tr>
        <tr>
          <th>학과</th>
          <td>{users.major}</td>
        </tr>
        <tr>
          <th>성별</th>
          <td>{users.gender}</td>
        </tr>
        <tr>
          <th>관심사</th>
          <td>{users.inter}</td>
        </tr>
        <tr>
          <th>자기소개</th>
          <td><pre>{users.selfy}</pre></td>
        </tr>
      </tbody>
    </table>
    </>
  )
}

export default User