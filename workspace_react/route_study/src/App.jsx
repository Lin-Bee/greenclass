import { Route, Routes } from "react-router-dom";
import "./App.css";
import Header from "./components/Header";
import BoardList from "./components/BoardList";
import BoardDetail from "./components/BoardDetail";
import Login from "./components/Login";
import BoardWrite from "./components/BoardWrite";
import BoardUpdate from "./components/BoardUpdate";
import Join from "./components/Join";
import MyPage from "./components/MyPage";

function App() {
  return (
    <>
      <Header />
      <Routes>
        <Route path="" element={<BoardList />} /> {/*목록*/}
        <Route path="detail/:num/:age" element={<BoardDetail />} />
        {/*상세*/}
        <Route path="/write" element={<BoardWrite />} /> {/*등록*/}
        <Route path="/update/:num" element={<BoardUpdate />} /> {/*수정*/}
        <Route path="/login" element={<Login />} /> {/*로그인*/}
        <Route path="/join" element={<Join />} /> {/*회원가입*/}
        <Route path="/my-page/:num" element={<MyPage />} /> {/*내페이지*/}
      </Routes>
    </>
  );
}

export default App;
