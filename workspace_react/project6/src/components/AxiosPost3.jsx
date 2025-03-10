import axios from "axios";
import React, { useEffect, useState } from "react";

const AxiosPost3 = () => {
  const [order, setOrder] = useState({
    // 받아오고 셋팅해줄 const변수선언
    food: "",
    cnt: 1,
    morecheck: "토핑",
    order: "",
    orderDay: "",
  });

  const changeOrder = (e) => {
    
    // 함수에다가 각각의 값 뿌려주기
    //변화할 ㅇ요소들에게 기본 값 주기
    setOrder({
      ...order,
      [e.target.name]: e.target.value,
      //name의 값이 : value의값이다
    });
  };

  console.log(order);

  //전송버튼 클릭시 서버로 보내는기능
  const sendData = () => {
    axios
      .post("/api/t10", order) //10페이지에
      .then((res) => {
        console.log(res);
        alert("전송완 굿굿");
      })
      .catch((error) => {
        console.log(error);
        alert("전송실패다 다쓰지못할까");
      });
  };

  const foodList = [
    {
      name: "피자",
      value: "피자",
    },
    {
      name: "치킨",
      value: "치킨",
    },
    {
      name: "족발",
      value: "족발",
    },
  ];

  const optionList = [
    { name: "토핑추가", value: "토핑추가", label: "토핑추가" },
    { name: "음료추가", value: "음료추가", label: "음료추가" },
    { name: "공기밥추가", value: "공기밥추가", label: "공기밥추가" },
  ];

  return (
    <>
      <table>
        <tbody>
          <tr>
            <th>음식</th>
            <td>
              <select
                name="food"
                value={order.food}
                onChange={(e) => {
                  changeOrder(e);
                }}
              >
                <option value={''}>음식을 선택해주세요</option>
                {foodList.map((foodCont, i) => {
                  return (
                    <option key={i} value={foodCont.value}>
                      {foodCont.name}
                    </option>
                  );
                })}
              </select>
            </td>
          </tr>
          <tr>
            <th>수량</th>
            <td>
              <input
                name="cnt"
                type="number"
                className="number"
                value={order.cnt}
                onChange={(e) => {
                  changeOrder(e);
                }}
              />
            </td>
          </tr>
          <tr>
            <th>추가선택</th>
            <td>
              {optionList.map((optionCont, i) => {
                {
                  console.log(optionCont.value);
                }
                return (
                  <>
                    <input
                      type="checkbox"
                      key={i}
                      name={optionCont.name}
                      id=""
                      value={optionCont.value}
                      checked={optionCont.name === optionCont.value}
                      onChange={(e) => {
                        changeOrder([e]);
                      }}
                    /><label>{optionCont.label}</label>
                  </>
                );
              })}
              {/* <input
                type="radio"
                name="morecheck"
                id=""
                value={"토핑"}
                checked={order.morecheck === "토핑"}
                onChange={(e) => {
                  changeOrder(e);
                }}
              />
              토핑추가
              <input
                type="radio"
                name="morecheck"
                id=""
                value={"음료"}
                checked={order.morecheck === "음료"}
                onChange={(e) => {
                  changeOrder(e);
                }}
              />
              음료추가
              <input
                type="radio"
                name="morecheck"
                id=""
                value={"공기밥"}
                checked={order.morecheck === "공기밥"}
                onChange={(e) => {
                  changeOrder(e);
                }}
              />
              공기밥추가 */}
            </td>
          </tr>
          <tr>
            <th>요청사항</th>
            <td>
              <textarea
                name="order"
                id=""
                value={order.order}
                onChange={(e) => {
                  changeOrder(e);
                }}
              ></textarea>
            </td>
          </tr>
          <tr>
            <th>주문일시</th>
            <td>
              <input
                name="orderDay"
                value={order.orderDay}
                type="date"
                onChange={(e) => {
                  changeOrder(e);
                }}
              />
            </td>
          </tr>
        </tbody>
      </table>
      <button
        type="button"
        onClick={(e) => {
          sendData();
        }}
      >
        전송
      </button>

      <div>
        {order.food}
        <br />
        {order.cnt}
        <br />
        {order.morecheck}
        <br />
        {order.order}
        <br />
        {order.orderDay}
      </div>
    </>
  );
};

export default AxiosPost3;
