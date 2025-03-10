import { Route, Routes } from "react-router-dom";
import "./App.css";
import Footer from "./layout/Footer";
import Header from "./layout/Header";
import MemberList from "./components/MemberList";
import Join from "./components/Join";
import Detail from "./components/Detail";
import Update from "./components/Update";

function App() {

  return (
    <>
      <Header />
      <Routes>
        <Route path="/" element={<MemberList />} />
        <Route path="/join" element={<Join />} />
        {/* 상세정보페이지 */}
        <Route path="/detail/:memId" element={<Detail />} />
        <Route path="/update/:memId" element={<Update />} />
      </Routes>
      <Footer />
    </>
  );
}

export default App;
