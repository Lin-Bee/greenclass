package practice;

import java.util.Scanner;

public class Practice_09_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를쓰세요");
		int a= sc.nextInt();
		System.out.println(a + 5);
	}
	public static String ex6(int a){
		//매개변수로 정수를 입력받아,
		//입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.
		//return a+"";
		//숫자>문자열
//	String a = String.valueOf(a)
		// 문자열 > 숫자
		//int a = Integer.parseInt("10");

		return String.valueOf(a);
	}
}
