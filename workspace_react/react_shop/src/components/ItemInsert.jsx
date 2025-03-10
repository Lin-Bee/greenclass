import React, { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import style from "./ItemInsert.module.css"

const ItemInsert = () => {
  const nav = useNavigate();
  const [item, setItem] = useState({
    itemName: "",
    itemPrice: 0,
    seller: "",
    itemIntro: "",
  });

  const insertItem = (e) => {
    setItem({
      ...item,
      [e.target.name]: e.target.value,
    });
  };

  const sendData = () => {
    if(!(item.itemName|| item.itemPrice)){
      alert('상품명과 가격은 필수다');
      return;
    }
    axios
      .post("/api/items", item)
      .then((res) => {
        console.log("item정보" + item);
        nav("/");
      })
      .catch((error) => console.log(error));
  };

  return (
    <>
      <div className="inner">
        <div className={style.item_insert}>
        <div className="tit-area">
          <h3 className="txt bold">상품등록을 해봅시다</h3>
        </div>
        <table>
          <tbody>
            <tr>
              <th>상품명</th>
              <td>
                <input
                  type="text"
                  name="itemName"
                  value={item.itemName}
                  onChange={(e) => insertItem(e)}
                />
              </td>
            </tr>
            <tr>
              <th>상품가격</th>
              <td>
                <input
                  type="number"
                  name="itemPrice"
                  value={item.itemPrice}
                  onChange={(e) => insertItem(e)}
                />
              </td>
            </tr>
            <tr>
              <th>판매자</th>
              <td>
                <input
                  type="text"
                  name="seller"
                  value={item.seller}
                  onChange={(e) => insertItem(e)}
                />
              </td>
            </tr>
            <tr>
              <th>상품설명</th>
              <td>
                <textarea
                  name="itemIntro"
                  value={item.itemIntro}
                  id=""
                  onChange={(e) => insertItem(e)}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
        <div className="btn-area">
          <button type="button" onClick={(e) => sendData(e)}>
            전송
          </button>
        </div>
        </div>
      </div>
    </>
  );
};

export default ItemInsert;
