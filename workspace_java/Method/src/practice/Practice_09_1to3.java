package practice;

import java.util.Scanner;

public class Practice_09_1to3 {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		System.out.println(ex1(a,b));

		Scanner sc = new Scanner(System.in);
		System.out.print("문제2번의 첫번째 정수 : ");
		int a2 = sc.nextInt();
		System.out.print("문제2번의 두번째 정수 : ");
		int b2= sc.nextInt();
		System.out.println(ex2(a2,b2));

		System.out.print("문제3번의 첫번째 정수 : ");
		int a3 = sc.nextInt();
		System.out.print("문제3번의 두번째 정수 : ");
		int b3= sc.nextInt();
		System.out.println("문제3번의 max : "+ex3(a3,b3));

	}
	public static int ex1(int a,int b){
		return a+b;
	}
	public static int ex2(int a2,int b2){
		return a2*b2;
	}
	public static int ex3(int a3,int b3) {
		if (a3 > b3) return a3;
		//a3>b3?a3:b3
		else return b3;
	}
}
