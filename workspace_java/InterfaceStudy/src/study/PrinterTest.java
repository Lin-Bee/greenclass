package study;

public class PrinterTest {
	public static void main(String[] args) {
		SamsungPrint s1 = new SamsungPrint();

		s1.print();
		s1.colorPrint();

		Print p2 = new SamsungPrint();
		// 인터페이스를 구현한 클래스의 생성자는 ㄱㅊ
		// 그렇다면 굳이구쥐 인터페이쓰를 쓰는이유가 뭐시얌
	}
}
