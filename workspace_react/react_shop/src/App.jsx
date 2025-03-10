import { useState } from "react";
import "./style/reset.css"
import "./App.css";
import "./style/layout.css"
import { Route, Routes } from "react-router-dom";
import ItemList from "./components/ItemList";
import ItemInsert from "./components/ItemInsert";
import ItemUpdate from "./components/ItemUpdate";
import Order from "./components/Order";
import OrderCategory from "./components/OrderCategory";
import OrderList from "./components/OrderList";

function App() {
  //falsy : false로 판단하는 내용
  //null, undefined, 0 ''
  //trutyh:falsy한 데이터빼고 전부

  const data = 'java';
  if(data){console.log(111);}

  return (
    <>
      <OrderCategory />
      <Routes>
        <Route path="/" element={<ItemList />} />
        <Route path="/itemInsert" element={<ItemInsert />} />
        <Route path="/items/:itemNum" element={<ItemUpdate />} />
        <Route path="/order" element={<Order />} />
        <Route path="/orderList" element={<OrderList />} />
      </Routes>
    </>
  );
}

export default App;
