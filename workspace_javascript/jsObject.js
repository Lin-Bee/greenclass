//객체 : key와 value 한상의 데이터로 이루어진 데이터 집합

//객체 선언
const obj1 = {};
const person = {
  name:'kim',
  age:30,
  addr:"울산",
  name:'고기' // key가 중복이면 마지막으로 넣은 데이터만 유효
//key:value 
};

console.log(person.name);
console.log(person['name']);
console.log(person);
//새로운 데이터 추가 방법
person.hobby = "공부";
person.age = 50;
console.log(person);
