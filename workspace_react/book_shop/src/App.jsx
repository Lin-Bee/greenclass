import { Route, Routes } from "react-router-dom";
import "./App.css";
import UserLayout from "./components/UserLayout";
import AdminLayout from "./components/AdminLayout";
import ItemForm from "./components/ItemForm";
import CateManage from "./components/CateManage";
import UserJoin from "./components/UserJoin";
import Login from "./components/Login";
import { useEffect, useState } from "react";
import UploadTest from "./components/practice/UploadTest";


function App() {
  const [loginInfo, setLoginInfo] = useState(null);
  //Login.jsx에서 로그인을 성공하면 setLoginInfo()함수를 이용해서
  //로그인한 정보를 loginInfo변수에 저장한다.
  //하지만 이상태에서 새로고침(f5)하면 loginInfo변수에 저장된 로그인 정보가 사라진다
  useEffect(() => {
    //sessionStorage에 있는 loginInfo 데이터 받아오기
    //받은 데이터는 객체가 아닌 json 데이터(문자열데이터)이다.
    const data = sessionStorage.getItem("loginInfo");
    if (data != null) {
      //const result = JSON.parse(data); //parse를 통해 변경가능
      //setLoginInfo(result);
      setLoginInfo(JSON.parse(data));
    }
  }, []);

  return (
    <div className="container">
      <UploadTest/>
      <Routes>
        {/* 유저가 접속하는 페이지 */}
        <Route path="/" element={<UserLayout loginInfo={loginInfo} setLoginInfo={setLoginInfo}/>}>
          {/* 상품목록 페이지 */}
          <Route path="" element={<div>상품 목록 페이지</div>} />

          {/* 상품 상세 페이지 */}
          <Route path="/detail" element={<div>상품 상세 페이지</div>} />

          {/* 회원 가입 페이지 */}
          <Route path="/signup" element={<UserJoin/>} />

          {/* 회원 가입 페이지 */}
          <Route path="/login" element={<Login setLoginInfo={setLoginInfo}/>} />
        </Route>

        {/* 관리자가 접속하는 페이지 */}
        <Route path="/admin" element={<AdminLayout loginInfo={loginInfo} setLoginInfo={setLoginInfo} />}>
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
