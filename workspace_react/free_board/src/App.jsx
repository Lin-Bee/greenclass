import { Route, Routes } from "react-router-dom";
import "./App.css";
import List from "./components/List";
import Detial from "./components/Detial";
import Write from "./components/Write";
import Update from "./components/Update";
import ReplyList from "./components/ReplyList";
import ReplyWrite from "./components/ReplyWrite";
import QueryString from "./components/QueryString";


function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<List />} />
        <Route path="/detail/:boardNum" element={<Detial />} />
        <Route path="/write" element={<Write />} />
        <Route path="/update/:boardNum" element={<Update />} />
        <Route path="/test" element={<QueryString />} />
      </Routes> 
    </>
  );
}

export default App;
