import React, { useEffect, useState } from "react";
import OrderCategory from "./OrderCategory";
import axios from "axios";
import { useNavigate, useParams } from "react-router-dom";

const ItemUpdate = () => {
  const params = useParams();
  const nav = useNavigate();
  const { itemNum } = params;
  const [itemCont, setItemCont] = useState({});
  const [num, setNum] = useState(0);

  const changeCont = (e) => {
    setItemCont({
      ...itemCont,
      [e.target.name]: e.target.value,
    });
  };

  //기본데이터 불러오기
  useEffect(() => {
    axios
      .get(`/api/items/${itemNum}`)
      .then((res) => {
        console.log("업데이트 불러오기");
        setItemCont(res.data);
      })
      .catch((error) => console.log(error));
  }, []);

  //변경될데이터 선언
  const sendData = (e) => {
    axios
      .put(`/api/items/${itemNum}`, itemCont)
      .then((res) => {
        alert("수정완료");
        nav(`/`);
      })
      .catch((error) => console.log(error));
  };

  return (
    <>
      <div className="inner">
        <table>
          <tbody>
            <tr>
              <th>상품명</th>
              <td>
                <input
                  type="text"
                  name="itemName"
                  value={itemCont.itemName}
                  onChange={(e) => changeCont(e)}
                />
              </td>
            </tr>
            <tr>
              <th>상품가격</th>
              <td>
                <input
                  type="text"
                  name="itemPrice"
                  value={itemCont.itemPrice}
                  onChange={(e) => changeCont(e)}
                />
              </td>
            </tr>
            <tr>
              <th>판매자</th>
              <td>
                <input
                  type="text"
                  name="seller"
                  value={itemCont.seller}
                  onChange={(e) => changeCont(e)}
                />
              </td>
            </tr>
            <tr>
              <th>상품설명</th>
              <td>
                <input
                  type="text"
                  name="itemIntro"
                  value={itemCont.itemIntro}
                  onChange={(e) => changeCont(e)}
                />
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
    </>
  );
};

export default ItemUpdate;
