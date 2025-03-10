function test(){
  const ul_tag = document.querySelector('.my-ul');
                //화면에.선택하여 찾을것이다 .my-ul을
  let data = '';
  for(let i = 0; i<500; i++){
    //ul_tag.innerHTML = ul_tag.innerHTML+`<li>${i}</li>`
    //ul태그 html = .my-ul 의 자식에 i 내부에 500번 누적시킨다 
    data = data +`<li>${i}</li>`
  }
  ul_tag.innerHTML = data;
  //시간이 소요되는것을 줄이기위해서는 내부코드를 최대한 적게 건드린다
}