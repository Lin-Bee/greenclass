package practice;

import java.util.Scanner;

public class Practice_08_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복시킬문자를 입력해주세요:");
		String s = sc.next();
		System.out.println("반복시킬횟수를 입력해주세요:");
		int num = sc.nextInt();

		ex15(s,num);
	}
	public static void ex15(String s,int num){
		//한 문자열과 정수를 매개변수로 받아,
		//매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 반복
		//출력하는 메소드를 선언하고 호출해보세요
		for(int i = 0; i<num; i++){
			System.out.println(i+"."+s);
		}

	}
}
