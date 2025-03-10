import React, { useEffect, useState } from "react";
import axios from "axios";

const Order = () => {
  //주문상품을위한 주문목록리스트
  const [itemList, setItemList] = useState([]);

  //주문을 위해 입력한 정보를 저장하는 변수
  const [order, setOrder] = useState({
    itemNum: "default",
    itemPrice: "상품을 선택하시오",
    buyer: "",
    buyCnt: 1,
    buyPrice: 0
  });

  console.log(order);

  const changeOrder = (e) => {
    if (e.target.name === "itemNum") {
      let setPrice = 0;
      for (const item of itemList) {
        if (item.itemNum == e.target.value) {
          setPrice = item.itemPrice;
        }
      }
      setOrder({
        ...order,
        [e.target.name]: e.target.value,
        itemPrice: setPrice
        //itemPrice: itemList.find((e)=>{return e.itemNum == e.target.value}).itemPrice
      });
    } else {
      setOrder({
        ...order,
        [e.target.name]: e.target.value
      });
    }
  };

  //불러오기
  useEffect(() => {
    axios
      .get("/api/items")
      .then((res) => {
        console.log("상품목록훔쳐오기");
        setItemList(res.data);
      })
      .catch((error) => console.log(error));
  }, []);

  const addOrder = (e) => {
    axios
      .post("/api/orders", order)
      .then((res) => {
        console.log(res.data);
        alert('됨?');
      })
      .catch((error) => console.log(error));
  };

  return (
    <>
      <div className="inner">
        <h3>상품상세정보</h3>
        <table>
          <tbody>
            <tr>
              <th>주문상품</th>
              <td>
                <select
                  name="itemNum"
                  id="itemList"
                  value={order.itemNum}
                  onChange={(e) => {
                    changeOrder(e);
                    // setINum(e.target.value);
                  }}
                >
                  <option value="default" disabled>
                    상품을 선택해주세요
                  </option>
                  {itemList.map((itemCont, i) => {
                    return (
                      <option key={i} value={itemCont.itemNum} name="itemName">
                        {itemCont.itemName}
                      </option>
                    );
                  })}
                </select>
              </td>
            </tr>
            <tr>
              <th>상품단가</th>
              <td>
                <input
                  type="text"
                  value={order.itemPrice}
                  name="itemPrice"
                  readOnly
                  onChange={(e) => {
                    changeOrder(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>주문자</th>
              <td>
                <input
                  type="text"
                  name="buyer"
                  value={order.buyer}
                  onChange={(e) => {
                    changeOrder(e);
                  }}
                />
              </td>
            </tr>
            <tr>
              <th>주문수량</th>
              <td>
                <input
                  type="text"
                  name="buyCnt"
                  value={order.buyCnt}
                  onChange={(e) => {
                    changeOrder(e);
                  }}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <div className="btn-area">
          <button
            type="button"
            onClick={(e) => {
              alert(order.buyCnt * order.itemPrice);
              addOrder(e);
            }}
          >
            주문하기
          </button>
        </div>
      </div>
    </>
  );
};

export default Order;
