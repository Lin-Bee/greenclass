package study;

public class CakeTest2 {
	public static void main(String[] args) {
		Cake c1 = new Cake();
		CheeseCake c2 = new CheeseCake();
		StrawberryCheeseCake c3 = new StrawberryCheeseCake();

		c2.eat();

		//보이진 않지만 오버라이딩의 개념이 적용된거임
		// 다형성의 불편한 점은 나의것을 쓸수없지만
		// 오버라이딩을하면 쓸수있음
		//.eat이라는 형태로 통일을하는 이유는 오버라이딩을써서 나의 것을 쓸수있어서
	}
}
