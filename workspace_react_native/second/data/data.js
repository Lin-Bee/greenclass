export const data = [
  {
    id: 1,
    item: "달걀한판",
  },
  {
    id: 2,
    item: "라면",
  },
  {
    id: 3,
    item: "주방세제",
  },
];

//cartList에서 id가 2인 데이터 찾기
//250314 오전 : find filter함수 배열속 특정요소찾기 / map합수
//e : 배열내 데이터 하나하나 중

//find: return에 작성한 조건문과 일치하는 데이터만 리턴
//예시 aaa1이라는 아이는 data라는 배열에서  id가 2인 값이다.
data.find(() => {});
const aaa1 = data.find((e) => {
  return e.id === 2;
});
//return 있으면 중괄호와 함께 생략가능
const aaa2 = data.find((e) => e.id === 2);

//find <-> filter
//return에 작성한 조건과 일치하는 데이터를제외
data.filter(() => {});
const aaa3 = data.filter((e) => {
  return e.id === 2;
});
const aaa4 = data.filter((e) => e.id === 2);

data.map((e, i) => {});
//cartList에서 id가 2인 데이터 찾기
for (const e of data) {
  if (e.id === 2) {
    //찾을수있음
  }
}
