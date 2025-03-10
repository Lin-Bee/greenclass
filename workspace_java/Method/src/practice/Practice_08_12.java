package practice;

import java.util.Scanner;

public class Practice_08_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		ex12(a);
	}
	public static void ex12(int num){
		for (int i = 0; i<=num+1; i++){
			System.out.println(i+"");
		}
	}
}
