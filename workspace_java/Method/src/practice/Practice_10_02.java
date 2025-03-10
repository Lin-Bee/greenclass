package practice;

import java.util.Scanner;

public class Practice_10_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100사이의정수를 입력하세요");
		int a = sc.nextInt();
		ex2(a);
	}
	public static void ex2(int a){
		int b = 1;
		while(b<=100){
			for(int i = 1; i<50; i++){
				b = a*i;
				System.out.println(a*i);
			}
			break;
		}
	}
}
