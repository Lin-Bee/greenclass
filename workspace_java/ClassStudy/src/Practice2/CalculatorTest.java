package Practice2;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		calculator.setA(sc.nextInt());
		System.out.print("두번째 수 : ");
		calculator.setB(sc.nextInt());
		System.out.print("연산자 : ");
		calculator.setOper(sc.next());

		calculator.showOper();
	}
}
