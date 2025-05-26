import { createSlice } from "@reduxjs/toolkit";

const memberSlice = createSlice({
  name: 'member',
  initialState : {
    memId : 'hong',
    memAge : 20
  },
  reducers : {
    handleMemberId : (state,action) =>{
      //return {...state, memId : 'java'};
      //state.memId = 'java';
      state.memId = action.payload;
      //위와 아래가같음 객체를 일반 변수처럼 바꾸기 가능
    }
  }
});

export const {handleMemberId} = memberSlice.actions;

export default memberSlice;