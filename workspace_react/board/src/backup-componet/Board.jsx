// import axios from "axios";
// import React, { useEffect, useState } from "react";
// import List from "./List";
// import Detail from "./Detail";

// const Board = () => {
//   const [boardList, setBoardList] = useState([]);
//   const [count, setCount] = useState(0); //addcount
//   const [showNum, setShowNum] = useState({ }); //key값 변수
  

//   useEffect(() => {
//     axios
//       .get("/api/boardInfo")
//       .then((res) => {
//         console.log("데이터 잘 가져옴");
//         setBoardList(res.data);
//       })
//       .catch((error) => {
//         console.log("에러");
//       });
//   }, []);

//   return (
//     <>
//       <h2>게시글 목록</h2>
//       <table className="t1">
//         <thead>
//           <tr>
//             <th>NO</th>
//             <th>제목</th>
//             <th>작성자</th>
//             <th>조회수 {boardList.cnt = count}</th>
//           </tr>
//         </thead>
//         <tbody>
//           {boardList.length == 0 ? (
//             <tr colSpan={4} className="nodata">
//               데이터가 없습니다
//             </tr>
//           ) : (
//             boardList.map((boardCont, i) => {
//               return (
//                 <List
//                   key={i}
//                   i={i}
//                   boardList={boardList}
//                   boardCont={boardCont}
//                   setCount={setCount}
//                   count={count}
//                   showNum={showNum}
//                   setShowNum={setShowNum}
//                 />
//               );
//             })
//           )}
//         </tbody>
//       </table>
//       <Detail />
//     </>
//   );
// };

// export default Board;
