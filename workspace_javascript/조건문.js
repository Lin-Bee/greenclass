//alert(123);
let num1 = 5;

//if문 동일
//num1이 3이상이면 3이상입니다출력
if(num1>=3){
  console.log(`${num1} 이므로 3 이상입니다.`);
}

//for문
for(let i = 1; i<11; i++){
  console.log(i);
}

//크기가없따
let array=[];
let array2=[1,2,3,'java'];

for(let i = 0; i<array2.length; i++){
  console.log(array2[i]);
}
console.log(array2);

//for of 문법
for (let e of array2) {
  console.log(e);
}
