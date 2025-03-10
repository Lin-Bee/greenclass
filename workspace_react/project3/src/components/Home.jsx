import React from "react";

//public private

const Home = () => {
  return (
    <>
      {/* 메인 스타트 */}
      <main className="main">
        <div className="qa-area">
          <div className="qa-q-area">
            <p>몇살이야?</p>
          </div>
          <div className="qa-a-area">
            <p>제..나이요?</p>
          </div>
        </div>
        <div className="howOldMe">
          <div className="old-img">
            <img src="" alt="" />
          </div>
          <div className="old-txt">
            <p>..나 몇살이지?</p>
          </div>
        </div>
        <a href="">내 나이 물어보러 가기</a>
      </main>
      {/* 메인 엔드 */}
      {/* 로딩스타트 */}
      <div className="loding">
        <p>나이? 까먹어버렸지만.. 그럴수있지</p>
        <div className="loding-ccago">
          <img src="" alt="" />
        </div>
        <div className="loding-bar">
          <div className="gray-area">
            <div className="black-bar"></div>
          </div>
        </div>
      </div>
      {/* 로딩엔드 */}
      {/* 나이작성 스타트 */}
      <div className="writeAge">
        <div className="title-area">
          <h3>나이계산하기</h3>
        </div>
        <div className="cont-area flex ai-center fd-column">
          <div className="cont-box">
            <p className="txt-year">
              <input type="date" name="" id="" />
            </p>
          </div>
          <div className="cont-box flex ai-center">
            <p className="txt-month">
              <select name="" id="">
                <option value="">1월</option>
              </select>
            </p>
            <p className="txt-month">
              <select name="" id="">
                <option value="">1일</option>
              </select>
            </p>
          </div>
          <div className="cont-box btn-area">
            <button type="button">나이계산하기</button>
          </div>
        </div>
      </div>
      {/* 나이작성 엔드 */}
      {/* 나이결과 스타트 */}
      <div className="writeAge">
        <div className="title-area">
          <h3>나이결과는?</h3>
        </div>
        <div className="cont-area flex ai-center fd-column">
          <div className="cont-box flex">
            <div className="animal-area">
              <div className="animal 동물"></div>
            </div>
            <div className="age-txt-area">
              <div className="top-txt">
                <p>yyyy년 mm월 dd일</p>
                <p>변수 해의 animal.name띠</p>
              </div>
              <div className="star-txt">
                <p>별자리 : 자리</p>
              </div>
            </div>
          </div>
          <div className="cont-box">
            <div className="korea-age">
              <p className="cont-tit">오늘 당신은</p>
              <p>
                00 <span>살</span>
              </p>
            </div>
            <div className="global-age">
              <p className="cont-tit">오늘 당신은</p>
              <p>
                00 <span>살</span>
              </p>
            </div>
          </div>
          <div className="cont-box ccago-area">
            <div className="img-box"></div>
            <div className="talk-box">문구변수</div>
          </div>
          <div className="cont-box btn-area">
            <button type="button">나이 계산 한번더</button>
          </div>
          <div className="ad-area">광고</div>
        </div>
      </div>
      {/* 나이결과 엔드 */}
      <footer>
        <address>&copy;EMBEERA</address>
      </footer>
    </>
  );
};

export default Home;
