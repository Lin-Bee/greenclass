import { Route, Routes } from "react-router-dom";
import "./App.css";
import UserLayout from "./components/UserLayout";
import AdminLayout from "./components/AdminLayout";
import ItemForm from "./components/ItemForm";
import CateManage from "./components/CateManage";
import UserJoin from "./components/UserJoin";
import State변경함수흐름3 from "./components/State변경함수흐름3";
import Login from "./components/Login";


function App() {
  return (
    <div className="container">
      {/* <State변경함수흐름3/> */}
      
      <Routes>

        {/* 유저가 접속하는 페이지 */}
        <Route path="/" element={<UserLayout />}>
          {/* 상품목록 페이지 */}
          <Route path="" element={<div>상품 목록 페이지</div>} />

          {/* 상품 상세 페이지 */}
          <Route path="/detail" element={<div>상품 상세 페이지</div>} />

          {/* 회원 가입 페이지 */}
          <Route path="/signup" element={<UserJoin/>} />

          {/* 회원 가입 페이지 */}
          <Route path="/login" element={<Login/>} />
        </Route>

        {/* 관리자가 접속하는 페이지 */}
        <Route path="/admin" element={<AdminLayout />}>
          {/* 상품등록 */}
          <Route path="reg-item" element={<ItemForm />} />

          {/* 카테고리 관리 */}
          <Route path="cate-manage" element={<CateManage />} />

          {/* 회원목록 */}
          <Route path="user-list" element={<div>회원관리</div>} />
        </Route>
      </Routes>
    </div>
  );
}

export default App;
