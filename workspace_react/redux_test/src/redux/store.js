import { configureStore } from "@reduxjs/toolkit";
import counterSlice from "./counterSlice";
import nameSlice from "./nameSlice";
import memberSlice from "./memberSlice";
import cartSlice from "./cartSlice";

export const store = configureStore({
  //저장할 데이터를 담아주면 됨
  reducer:{
     counter:counterSlice.reducer,
     myName:nameSlice.reducer,
     member:memberSlice.reducer,
     cart:cartSlice.reducer
  }
});