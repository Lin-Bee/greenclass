package practice;

import java.util.Scanner;

public class Practice_10_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단이 궁금하신가용?");
		int a = sc.nextInt();
		nines(a);
	}
	public static void nines(int a){
		for(int i= 1; i<10; i++){
			int b = a*i;
			System.out.println(a +"*"+i+"="+b);
		}

	}
}
