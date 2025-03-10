package practice;

import java.util.Scanner;

public class Practice_08_08to11 {
	public static void ex08( int num08_1, int num08_2){
		System.out.println(num08_1+","+num08_2);
	}
	public static void ex09( int num09_1, int num09_2){
		System.out.println(num09_1+"+"+num09_2+"="+(num09_1+num09_2));
	}
	public static void ex10( int num10){
		//EX10(5) 메서드의 인자로 5가 전달되었습니다.
		//System.out.println(num10%2==0?"짝수입니다":"홀수입니다");
		if(num10%2==0){
			System.out.println(num10+"은 짝수이다");
		} else if (num10%2==1) {
			System.out.println(num10+"은 홀수이다");
		} else if (num10 == 0){
			System.out.println("0은 나눌수없다");
		}
	}
	public static void ex11(int num11_1,int num11_2){
		if(num11_1%2==0) {
			if(num11_2%2==0){System.out.println("두수 모두 짝수이다");}
		}else if(num11_2%2==1){
			if(num11_2%2==1){System.out.println("두수 모두 홀수이다");}
		}else{
			System.out.println("한 수만 짝수이다");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째숫자입력");
		int num = sc.nextInt();
		System.out.println("두번째숫자입력");
		int num1 = sc.nextInt();

		System.out.println("문제 8번");
		ex08(num,num1);
		System.out.println("문제 9번");
		ex09(num,num1);

		System.out.println("문제 11번");
		ex11(num,num1);

		System.out.println("10번용숫자입력");
		int num2 = sc.nextInt();
		System.out.println("문제 10번");
		ex10(num2);

	}

}
