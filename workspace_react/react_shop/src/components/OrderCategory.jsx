import React from "react";
import { Link, NavLink, useNavigate } from "react-router-dom";

const OrderCategory = () => {
  return (
    <>
      <ul className="flex ju-around OrderCategory">
        <li>
          <NavLink to={'/'} className={(data)=>{return data.isActive? "active":""}}> 상품정보</NavLink>
        </li>
        <li>
          <NavLink to={"/itemInsert"} className={(data)=>{return data.isActive? "active":""}}> 상품등록</NavLink>
        </li>
        <li>
          <NavLink to={"/order"} className={(data)=>{return data.isActive? "active":""}}> 주문하기</NavLink>
        </li>
        <li >
          <NavLink to={"/orderList"} className={(data)=>{return data.isActive? "active":""}}> 주문목록</NavLink>
        </li>
      </ul>
      
      
      
    </>
  );
  
};

export default OrderCategory;
