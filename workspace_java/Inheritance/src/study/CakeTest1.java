package study;

public class CakeTest1 {
	public static void main(String[] args) {
		//다형성
		//다형성을 통해 생성된 객체는 상위클래스의 변수와 매서드만 사용가능
		StrawberryCheeseCake c1 = new StrawberryCheeseCake();
		Cake c2 = new StrawberryCheeseCake();
		//StrawberryCheeseCake c2 = new Cake(); 자식은 부모를 담을 수 없음
		CheeseCake c3 = new StrawberryCheeseCake();
		Cake c4 = new StrawberryCheeseCake();
		Cake c6 = new Cake();
		StrawberryCheeseCake c7 = (StrawberryCheeseCake)c6; // 말차케익이 딸기케이크가될순없지
		//.ClassCastException 캐스팅오류


		//c4객체를 딸기치즈케이크로 변환가능 >
		// 상위객체를 하위객체로 상세설정가능
//		StrawberryCheeseCake c5 = (StrawberryCheeseCake)c4;
//		c5.eatStrawberryCheeseCake();
//
//		System.out.println("c1");
//		c1.eatStrawberryCheeseCake();
//		c1.eatCheeseCake();
//		c1.eatCake();
//
//		System.out.println("c2 케이크라 다가능");
//		c2.eatCake();
//
//		System.out.println("c3 스트로베리치즈케이크인데 치즈케이크만가능함");
//		c3.eatCake();
//		c3.eatCheeseCake();

	}
}
