package Practice;

import java.util.Scanner;

public class CalculusTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//클래스랑 객체쓸때 미리 값을 넣어줄 아리아필요
		Calculus result = new Calculus();
		//num1 num2 oper를 불러올것이다 라는 선언
		//내가 불러서 쓸영역의 result라는 변수 = new 내가 부를 클래스

		System.out.print("첫번째 숫자 :");
		result.setNum1(sc.nextInt());
		System.out.print("두번째 숫자 :");
		result.setNum2(sc.nextInt()); // 일반적인불러오는방식
		System.out.print("연산자 : ");
		String oper = sc.next();// 일반적인불러오는방식

		System.out.print(result.getNum1() +oper+ result.getNum2() + " = ");
		switch(oper){
			case "+":
				System.out.print(result.getSum());
			break;
			case "-":
				System.out.println(result.getSub()); break;
			case "*":
				System.out.println(result.getMulti()); break;
			case "/":
				System.out.println(result.getDiv()); break;
			default:
				System.out.println("연산자 틀림");
		}


	}
}
