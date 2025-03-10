package study;
/*
	클래스에 대한 기본설명은 종이참고

	자동차를 객체로 만들기 위해 자동차 설계도를 작성!
	클래스의 구성요소 : 데이터(변수), 기능(메서드의 정의), 생성자
	                  : if문도 for문도 ㄴㄴ(메서드의 정의만 포함됨 기능
   = 설계도 짜는 Class
	맴버변수 vs 지역변수
	- 지역변수는 반드시 초기화필요
	- 멤버변수는 초기화 하지않으면 기본값으로 초기화가 자동 진행
	>기본적인 변수의 개념은따라감
*/
//클래스를 오로지 설계도로 쓰기위해 사용 x
//클래스 안에서 선언한 변수를 : 멤버변수(member variable), 필드 라고 부름
//매서드 안에서 선언한 변수는 : 지역변수(local variable) 라고 부름
//매개변수는 지역변수 중 한 종류이다.


public class Car {
	//데이터(자동차가 가져야하는 정보)
	String carName; //자동차명
	int carPrice; //차가격
	String carBrand;

	//자동차의 시동거는기능
	public void powerOn(){
		System.out.println("시동을겁니다");
	}

	//브레이크를 밟는기능
	public void takeBreak(){
		System.out.println("브레이크를 밟습니다");
	}


}
