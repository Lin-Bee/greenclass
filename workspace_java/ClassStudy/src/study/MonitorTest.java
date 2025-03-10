package study;

public class MonitorTest {
	public static void main(String[] args) {
		Monitor m1 = new Monitor(); // 생성자호출
		Monitor m2 = new Monitor("java"); // 생성자호출
		Monitor m3 = new Monitor("샘숭","핑크"); // 생성자호출

		m1.printInfo();
		System.out.println("");
		m2.printInfo();
		System.out.println("");
		m3.printInfo();

	}
}
