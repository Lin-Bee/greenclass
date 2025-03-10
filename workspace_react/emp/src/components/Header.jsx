import React from 'react'

const Header = () => {
  return (
    <>
    <header>
      <nav>
        <ul>
          <li><navLink to={"/"} className="">부서&직급관리</navLink></li>
          <li><navLink to={"/empCare"} className="">사원관리</navLink></li>
          <li><navLink to={"/empList"} className="">사원조회</navLink></li>
        </ul>
      </nav>
    </header>
    </>
  )
}

export default Header