import React, { useEffect, useState } from "react";
import OrderCategory from "./OrderCategory";
import axios from "axios";
import ItemDetail from "./ItemDetail";


const ItemList = () => {
  const [itemList, setItemList] = useState([]);
  const [itemNum, setItemNum] = useState(0);
  const [isShow, setIsShow] = useState(false);
  // const [isDetail, setIsDetail] = useState(null);
  

  useEffect(() => {
    axios
      .get("/api/items")
      .then((res) => {
        console.log("주문목록 불러오기");
        setItemList(res.data);
        //setIsDetail(res.data);
        console.log(res.data);
      })
      .catch((error) => console.log(error));
  }, []);

  return (
    <>
      <div className="inner">
        <div className="flex show-item-area">
          <div className="list-area">
            <p>총 {itemList.length} 개의 상품이 등록되었습니다.</p>
            <table>
              <colgroup>
                <col width="10%"/>
                <col width="30%"/>
                <col width="30%"/>
                <col width="30%"/>
              </colgroup>
              <thead>
                <tr>
                  <th>NO</th>
                  <th>상품명</th>
                  <th>상품가격</th>
                  <th>판매자</th>
                </tr>
              </thead>
              <tbody>
                {itemList.length === 0 ? (
                  <tr>
                    <td colSpan={4}>등록된 상품이 없습니다.</td>
                  </tr>
                ) : (
                  itemList.map((item, i) => {
                    return (
                      <tr key={i}>
                        <td>{itemList.length - i}</td>
                        <td>
                          <span
                            onClick={(e) => {
                              setItemNum(item.itemNum);
                              setIsShow(true);
                              console.log(itemNum);
                            }}
                          >
                            {item.itemName}
                          </span>
                        </td>
                        <td>￦ {item.itemPrice}</td>
                        <td>{item.seller}</td>
                      </tr>
                    );
                  })
                )}
              </tbody>
            </table>
          </div>
          { isShow ? <ItemDetail itemNum={itemNum} /> : null}
          {/* 같은 영역에 디테일이 있을때 가능 */}
          {/* { isDetail && <ItemDetail itemNum={itemNum}
                                        itemName={itemName}
                                        setDetail={setDetail}
                                        setCnt={setCnt}
                                        cnt={cnt} />} */}
        </div>
      </div>
    </>
  );
};

export default ItemList;
