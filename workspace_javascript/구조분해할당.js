//배열의 데이터를 다른 변수에 저장하는 일반적인 방법
const arr1 = [1,2,3];
let a = arr1[0];
let b = arr1[1];
let c = arr1[2];

//구조분해할당
let[aa,bb,cc] = arr1;//[1,2,3]
console.log(aa,bb,cc);

let[aaa,bbb] = arr1;//[1,2,3]
console.log(aaa,bbb);

let[a1,b1,c1,d1] = arr1;//[1,2,3]
console.log(a1,b1,c1,d1);

const person={ //객체 생성함
  name : 'kim',
  age : 20,
  hobby : '공부'
};

console.log('');
const {age,name,hobby} = person;
console.log(name,age,hobby); // 동일하면 형태가 들어오지만
console.log(age,name,hobby);
// 순서가 변경될 경우 출력 형태가 달라짐 각각의 형태보여줌

console.log('');
const {age1,name:name1,hobby1} = person;
//이렇게 출력할 경우에는 명이 달라서 안됨
console.log(age1,name1,hobby1); 
//바꿔주기 위해서는 이름을 바꾸는 문구도있다.

console.log('');
const student = {
  name:'kim',
  age:30,
  korScore:70,
  engScore:80
}
//student가 왔을때 학생의 총점을 리턴하세요

function getSum(s){
  let korScore = s.korScore;
  let engScore = s.engScore;
  
  return korScore+engScore;
}
getSum(student);

//{korScore,engScore} = student;
function getSum1({korScore,engScore}){
  return korScore+engScore;
}
getSum1(student);

const phone = {
  modelName : 's9',
  price : 10000
}
//매개변수로 phone을 전달하면 폰 객체의 모델명과 가격을 출력하는 함수

function p1(p){
  console.log(p.modelName,p.price);
}

p1(phone);

function p2({modelName,price}){
  console.log(modelName,price);
}
p2(phone);