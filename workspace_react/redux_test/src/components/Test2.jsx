import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { handleMemberId } from '../redux/memberSlice';

const Test2 = () => {
  const member = useSelector(state => state.member);
  const dispatch = useDispatch();

    return (
    <>
      <div>회원이름 : {member.memId}</div>
      <div>회원나이 : {member.memAge}</div>
      <button type='button' onClick={()=>{
        dispatch(handleMemberId('kim'));
      }}>kim씨로 바뀌어라 버튼</button>
    </>
  )
}

export default Test2