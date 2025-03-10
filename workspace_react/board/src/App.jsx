import "./App.css";
import List from "./components/List";
import { Route, Routes } from "react-router-dom";

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<List />} />
        {/*<Route path="/write" element={<Write />} />
         <Route path="/update/:boardNum" element={<Update />} />
        <Route path="/detail/:boardNum" element={<Detial />} /> */}
      </Routes>
    </>
  );
}

export default App;
