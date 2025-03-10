//1. 이름, 부서, 직급, 급여의 네 개의 데이터를 갖는 객체 emp를 생성해보세요.
//  각 데이터의 값은 임의의 값으로 설정하면 됩니다.
const emp = [
  {
    name : "김과장",
    dept : "개발부",
    rank : "과장",
    pay : 10000
  },
  {
    name : "이차장",
    dept : "개발부",
    rank : "차장",
    pay : 20000
  },
  {
    name : "송주임",
    dept : "디자인부",
    rank : "주임",
    pay : 50000
  },
  {
    name : "박주임",
    dept : "디자인부",
    rank : "주임",
    pay : 50000
  }
];

// 2. 1번에서 만든 emp 객체 하나를 매개변수로 받아, 
// 전달받은 객체의 부서가 '개발부'라면 해당 객체의 급여를 출력하고, 
// '개발부'가 아니라면 '부서가 잘못되었습니다'를 출력하는 함수를 화살표함수로 구현하고 호출하세요.

const showDevPay=(num)=>{
  let a = emp[num];
  // if(a.dept === "개발부"){
  //   console.log(`${a.name} 은 ${a.pay} 원을 받음`);
  // }else{console.log(`${a.name}은 개발부가 아닙니다`);}
  // 삼항연산자로 변화
  console.log((a.dept === "개발부" ? `${a.name} 은 ${a.pay} 원을 받음`:`${a.name}은 개발부가 아닙니다`));
}
showDevPay(1);
console.log('');
// emp객체 두 개를 매개변수로 받아, 매개변수로 전달된 두 객체 중 급여가 높은 객체의 이름을 리턴하는 함수를 함수표현식으로 구현하고 호출해보세요.

const expansiveHuman = (aHuman,bHuman) => {
  let a = emp[aHuman];
  let b = emp[bHuman];
  if(a.pay>b.pay){
    return console.log(a.name);
  }else if(b.pay>a.pay){
    return console.log(b.name);
  }else{
    return console.log(`${a.name}과${b.name}은 급여가 같습니다`);
  }
}
expansiveHuman(1,3);
console.log('');
const foodList = [
  { //객체임
    name : '김치찌개',
    price : 12000,
    type : '한식',
    material : ['김치','두부', '돼지고기']
  }, 
  {
    name : '짜장면',
    price : 8000,
    type : '중식',
    material : ['춘장','밀가루', '양파', '오이']
  }, 
  {
    name : '불고기',
    price : 15000,
    type : '한식',
    material : ['소고기','양파', '대파']
  }, 
  {
    name : '탕수육',
    price : 25000,
    type : '중식',
    material : ['돼지고기','밀가루']
  },
  {
    name : '마라탕',
    price : 15000,
    type : '중식',
    material : ['돼지고기','밀가루','마라']
  }
];

//4. 모든 음식의 이름을 출력
const showFoodName = (foodList) =>{
  for(let i = 0; i<foodList.length; i++){
    console.log(foodList[i].name);
  }
}
showFoodName(foodList);
console.log('');

//5. 한식 음식의 합을 출력
//function showFoodPriceSum (foodList){  함수기본
//const showFoodPriceSum = (foodList) =>{  화살표함수
const showFoodPriceSum = function(foodList){ //함수표현식
  let foodPriceSum=0;
  for(let food of foodList){ //자바의 foreach 와 유사한 for of 가 있음
    if(food.type === "한식"){
    foodPriceSum += food.price;
    }
  }
  return console.log(`한식 가격의 합은 ${foodPriceSum}`);
}
showFoodPriceSum(foodList);
console.log('');

//6. material이 3이상인거 새로운 배열에 담아 출력
const showThreeUpMaterial = (foodList) =>{
  let threeUpMaterial = [];
  for(let i = 0; i<foodList.length; i++){
    if(foodList[i].material.length>=3){
      //console.log(foodList[i]);
      threeUpMaterial.push(foodList[i]);
    }
  }
  return console.log(threeUpMaterial);
}
showThreeUpMaterial(foodList);
console.log('');

//재료 출력하기
const showFoodMaterial = (list,foodListname) =>{
  //그냥 내가한 방법
  //let result;
  // let i = 0;
  // while(i<list.length){
  //   if(foodListname === list[i].name){
  //     result = `${foodListname}의 재료는 ${list[i].material}입니다`;
  //     break;
  //   }else{
  //     result = "그런 음식 여기 없음";
  //   }
  //   i++;
  // }
  //console.log(result);  

  // 두번째방법
  // for(let i = 0; i < list.length; i++){
  //   if(foodListname === list[i].name){
  //     console.log(`${foodListname}의 재료는 ${list[i].material}입니다`);
  //      isFind == true
  //     break;
  //   }
  // }
  // if(!isFind){
  //   console.log('정보없음');
  // }

  for(let i = 0; i < list.length; i++){
    if(foodListname === list[i].name){
      console.log(`${foodListname}의 재료는 ${list[i].material}입니다`);
      return;
    }
  }
  console.log('정보없음');

}
showFoodMaterial(foodList,"김치찌개");
console.log('');


//매개변수로 5보다 큰 숫자가 들어올때만 안녕이라는 글자를 출력한다
function aaa(num){
  if(num>5){
    console.log("안녕");
  }
}

// return키워드 작성 후 데이터를 작성하지 않으면 return을 만나면 종료
function bbb(num){
  if(num>5){
    reutrn; 
  }
  console.log("안녕");
}
