import axios, { Axios } from "axios";
import React, { useEffect, useState } from "react";

const Shop = (props) => {
  const [item, setItem] = useState({
    itemCode : 0,
    itemName : "",
    itemPrice : 0,
    itemIntro : "",
    regDate : ""
});


  const items = (index) => {
    axios
      .post("/api/items")
      .then((res) => {
        console.log(res);
        const item = [...res.data];
        item[index] = res.data;
        setItem(item);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <>
      <div className="list">
        <table>
          <tbody>
            <tr>
              <th>dd</th>
              <td>{items.itemName}</td>
              
            </tr>
          </tbody>
        </table>
      </div>

      <div className="write">
        <h2>Shop Insert</h2>
        <table>
          <tbody>
            <tr>
              <th>상품명</th>
              <td>
                <input type="text" /> itemName
              </td>
            </tr>
            <tr>
              <th>가격</th>
              <td><input type="number"  />원 </td>
            </tr>
            <tr>
              <th>상품설명</th>
              <td>itemPrice</td>
            </tr>
            <tr>
              <th>날짜</th>
              <td>
                <input type="date" className="date" />
              </td>
            </tr>
          </tbody>
        </table>
        <button
          onClick={(e) => {
            // setItem(); > 인설트되고
          }}
        ></button>
      </div>
    </>
  );
};

export default Shop;
