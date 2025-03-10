import "./App.css";
import Header from "./components/Header";
import SideMenu from "./components/SideMenu";
import Footer from "./components/Footer";
import StateTest from "./components/StateTest";
import Ex from "./components/Ex";


function App() {
  let title = "오늘의 제목";
  let arr = [1,2,5,8,46];
  let obj = {
    name:'kim',
    age:50
  };

  let num = 1;

  return (
    <>
      <Ex/>
      {/* if문은 올수 없지만 삼항연산자는 올 수 있음 */}
      {num>=3?<div>3 이상입니다</div>:null}
      <StateTest/>
      <Header />
      <div>title 선언 : {title}</div>
      <div className="soso">title 선언 : {title}</div>
      <div style={{backgroundColor:'red'}}>{10}+{20}</div>
      <div>{10+20}</div>
      <div>{arr}</div>
      <div>{obj.name}</div>
      <SideMenu />
      <Footer />
    </>
  );
}

export default App;
