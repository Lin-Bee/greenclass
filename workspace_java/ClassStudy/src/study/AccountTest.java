package study;

public class AccountTest {
	public static void main(String[] args) {
		//1. 계좌생성
		Account acc1 = new Account(); //생성자명 == 클래스명 ★★★불변★★★
		//객체생성문법:클래스명 객체명 = new 생성자호출;
		//acc1 라는 이름을가진 Account 객체를 생성한다
		//new라고 하는 새로운 영역에 Account에 호출하는것


		//2. 초기값셋팅 : 생성과 동시에 셋팅이 이미됨
		acc1.printAccInfo(); //constructor 생성자를 이용해 사전설정함

	}
}
