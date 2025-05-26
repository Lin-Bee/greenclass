import { createSlice } from "@reduxjs/toolkit";

const memberSlice = createSlice({
  name : 'member',
  initialState : {
    memName : 'kim',
    memAge : 20
  },
  reducers :{
    changeMemberName : (state, action) => {
      return {...state, memName : action.payload}
    },
    handleMemberName : (state, action) => {
      state.name = action.payload
    }
  }
});

export const {changeMemberName} = memberSlice.actions
export default memberSlice;


