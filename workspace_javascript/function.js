let a = 0;
console.log(a);
// 위 처럼 선언하는것과 동일한

// 자바와의차이 : 리턴타입이없음
// 기본함수 선언방식
function printHello(){
  console.log("printHello");
}
//함수 표현식
const prinHello2 = function(){console.log("printHello2");}

const prinHello3 = () =>{console.log("printHello2");}
//함수선언할수읻ㅆ는 많은 방법 중 하나
//자바스크립트는 함수를 변수에 저장가능
//화살표 함수 arrow funtion : 간략설명


//호출해줌
printHello(); //위에서 호출해도 호출가능
prinHello2(); //위에서 호출하면 호출안됨 변수라서

//매개변수로 두 정수를 받아 두정수의 합을 출력
function prinSum(num1,num2){
  console.log(num1+num2);
}

prinSum(5,15);

//return; : 매개변수로 두 수를 전달받아 두수의 곱을 리턴하는 함수
function getMul(a,b){
  return a*b;
}

let result = getMul(5,8); 
console.log(result);

function f1(a,b){console.log(a+b)}
const f2 = function(){console.log(a+b)}
const f3 = () => {console.log(a+b)}
