import styles from "./UserHeader.module.css";
import { Link, useNavigate } from "react-router-dom";

const UserHeader = ({loginInfo,setLoginInfo}) => {
  const nav = useNavigate("");
  return (
    <div className={styles.header_container}>
      {loginInfo == null ? (
        <div className={styles.login_div}>
          <span>
            <Link to={"/login"}>LOGIN</Link>
          </span>
          <span>
            <Link to={"/signup"}>SIGNUP</Link>
          </span>
        </div>
      ) : (
        <div className={styles.login_div}>
          <span>{loginInfo.userId}님 반갑습니다</span>
          <span>
            <Link to={"/mypage"}>MyPage</Link>
          </span>
          <span>
            <button
              type="button"
              onClick={() => {
                sessionStorage.removeItem('loginInfo',JSON.stringify(loginInfo));
                setLoginInfo();
                alert(`로그아웃 되셨습니다`);
                nav("/");
              }}
            >
              Logout
            </button>
          </span>
        </div>
      )}
      <div className={styles.banner_div}>
        <img src="/book_banner.PNG" />
        <p>BOOK CAFE</p>
      </div>
      <div className={styles.menu_div}>
        <ul className={styles.menu_ul}>
          <li>전체</li>
          <li>IT/인터넷</li>
          <li>소설</li>
          <li>자기계발</li>
        </ul>
      </div>
    </div>
  );
};

export default UserHeader;
