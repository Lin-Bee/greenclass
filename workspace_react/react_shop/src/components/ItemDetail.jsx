import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const ItemDetail = (props) => {
  //props를 통해 받아오는값도 변경이가능함
  const [item, setItem] = useState({});
  const nav = useNavigate();
  const day = dayjs(item.regDate).format("YYYY-MM-DD");

  console.log("상세페이지 " + props.itemNum);
  const itemNum = props.itemNum;

  useEffect(() => {
    axios
      .get(`/api/items/${itemNum}`)
      .then((res) => {
        console.log("상품상세 불러오기");
        console.log(res.data);
        setItem(res.data); 
        //리스트에서 임시로 선언해준 값을 불러오는 detail의 영역이 워낼는 여기 선언되야함
        //setIsDetail(res.data); // 여기서 값을 셋팅해줌
      })
      .catch((error) => console.log(error));
  }, [itemNum]);
  return (
    <>
      <div className="detail-area">
        <p>상품 상세정보</p>
        <table>
          <tbody>
            <tr>
              <th>상품번호</th>
              <td>
                <input type="text" value={item.itemNum} name="itemNum" readOnly={true}/>
              </td>
            </tr>
            <tr>
              <th>상품명</th>
              <td>
                <input type="text" value={item.itemName} name="itemName" />
              </td>
            </tr>
            <tr>
              <th>상품가격</th>
              <td>
                <input type="text" value={item.itemPrice} name="itemPrice" />
              </td>
            </tr>
            <tr>
              <th>판매자</th>
              <td>
                <input type="text" value={item.seller} name="seller" readOnly={true}/>
              </td>
            </tr>
            <tr>
              <th>판매시작일</th>
              <td>
                
                <input type="text" value={day} name="regDate" readOnly/>
              </td>
            </tr>
            <tr>
              <th>상품설명</th>
              <td>
                <input type="text" value={item.itemIntro} name="itemIntro" />
              </td>
            </tr>
          </tbody>
        </table>
        <div className="btn-area">
          <button type="button" onClick={() => nav(`/items/${itemNum}`)}>
            수정
          </button>
        </div>
      </div>
    </>
  );
};

export default ItemDetail;
