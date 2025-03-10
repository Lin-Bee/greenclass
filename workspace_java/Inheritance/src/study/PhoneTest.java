package study;

public class PhoneTest {
	public static void main(String[] args) {
		//모바일 안에 스마트폰이있음 -> 모바일이 지금 구형폰이란뜻임

		MobilePhone mp1 = new MobilePhone();
		SmartPhone sp1 = new SmartPhone();

		//상위 클래스는 하위 클래스의 객체를 받음
		MobilePhone mp2 = new SmartPhone();

		//하위 클래스는 상위클래스의 객체를 받을 수 없음
		//SmartPhone sp2 = new MobilePhone(); 안댐



	}
}
