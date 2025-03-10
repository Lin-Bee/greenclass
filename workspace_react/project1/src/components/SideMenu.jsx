import React from "react";

const boom=()=>{
  console.log('부붐');
}

const SideMenu = () => {
  return (
    <>
      <div>사이드메뉴임</div>
      <button type="button" onClick={boom}>사이드의 버튼임</button>
      <button type="button" onClick={boom}>사이드의 버튼임2</button>
    </>
  );
};

export default SideMenu;
