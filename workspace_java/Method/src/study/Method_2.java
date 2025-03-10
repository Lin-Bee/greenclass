package study;

import java.util.Scanner;

public class Method_2 {
	//이름을 출력하는 메서드
	public static void printName(){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		System.out.print("제 이름은 "+name+"입니다.");
	}
	//나이를 출력하는 메서드
	public static void printAge(){
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("태어난 연도를 작성하세요");
		int year = sc.nextInt();
		age = 2024 - year;
		System.out.println("저는"+  age + "살 입니다");
	}
	public static void main(String[] args) {
		System.out.println("시작");
		printName();
		printAge();
		System.out.println("끝");
	}
}
