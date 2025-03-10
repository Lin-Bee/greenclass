package practice;

import java.util.Scanner;

public class Practice_10_04 {
	public static void main(String[] args) {
		//정수 하나를 매개변수로 받아,
		Scanner sc = new Scanner(System.in);
		System.out.println("마 짝수를 찾아주지");
		int a = sc.nextInt();
		boolean result = evenOdd(a);
		System.out.println(result);
	}
	public static boolean evenOdd(int a){
		// 매개변수가 짝수면 true, 홀수면 false를 리턴하는 메소드를 만들고 활용해보자.
		return a%2==0;
	}
}
