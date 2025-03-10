import React, { useEffect, useState } from "react";
import OrderCategory from "./OrderCategory";
import axios from "axios";

const OrderList = () => {
  const [orderList, setOrderList] = useState([]);

  useEffect(() => {
    axios
      .get("/api/orders")
      .then((res) => {
        console.log("주문목록 불러오기");
        setOrderList(res.data);
        console.log(res.data);
      })
      .catch((error) => console.log(error));
  }, []);
  return (
    <>
      <div className="inner">
        <div className="list-area">
          <p>총 {orderList.length} 개의 주문이 확인되었습니다.</p>
          <table>
            <thead>
              <tr>
                <th>NO</th>
                <th>상품명</th>
                <th>상품단가</th>
                <th>구매수량</th>
                <th>구매가격</th>
                <th>주문자</th>
                <th>주문일</th>
              </tr>
            </thead>
            <tbody>
              {orderList.length === 0 ? (
                <tr>
                  <td colSpan={7}>받은 주문이 없습니다.</td>
                </tr>
              ) : (
                orderList.map((order, i) => {
                  return (
                    <tr key={i}>
                      <td>{orderList.length - i}</td>
                      <td>{order.itemName}</td>
                      <td>￦ {order.itemPrice}</td>
                      <td>{order.buyCnt}</td>
                      <td>￦ {order.buyPrice}</td>
                      <td>{order.buyer}</td>
                      <td>{order.buyDate}</td>
                    </tr>
                  );
                })
              )}
            </tbody>
          </table>
        </div>
      </div>
    </>
  );
};

export default OrderList;
