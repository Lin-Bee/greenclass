import { createSlice } from "@reduxjs/toolkit";

const nameSlice = createSlice({
  name: 'name',
  initialState:'hong',
  reducers:{
    changeName:(state,action)=>{
      return state+action.payload;
    }
  }
});

export const {changeName} = nameSlice.actions;

export default nameSlice;