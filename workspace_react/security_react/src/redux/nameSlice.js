import { createSlice } from "@reduxjs/toolkit";

const nameSlice = createSlice({
  name : 'name',
  initialState : {data : 'hong'},
  reducers :{
    changeName : (state, action) => {
      state.data += action.payload
    }
  }
});

export const {changeName} = nameSlice.reducer
export default nameSlice;





