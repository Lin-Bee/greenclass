import { createSlice } from "@reduxjs/toolkit";
import { cartList } from './data';

const cartSlice = createSlice({
  name:'cart',
  initialState: cartList,
  reducers : {
    deleteCart : ()=>{
      return 1;
    },
    insertCart : (state,action)=>{
      //return [...state, action.payload]
      state.push(action.payload);
    }
  }
});

export const {deleteCart, insertCart} = cartSlice.actions;

export default cartSlice;