package practice;

public class Practice_08_01to07 {
	public static void main(String[] args) {
		System.out.println("Method문제 1.");
		sayHello();
		System.out.println("Method문제 2.");
		ex2(5);
		System.out.println("Method문제 3.");
		ex3("고기");
		System.out.println("Method문제 4.");
		ex4(3, 9);
		System.out.println("Method문제 5.");
		ex5(5, 2, 4);
		System.out.println("Method문제 6.");
		ex6(8, 3);
		System.out.println("Method문제 7.");
		ex7("고기", " 먹쟈");
	}

	public static void sayHello() {
		System.out.println("안녕하세요");
	}

	public static void ex2(int ex2_int) {
		System.out.println(ex2_int);
	}

	public static void ex3(String ex3_st) {
		System.out.println(ex3_st);
	}

	public static void ex4(int ex4_1, int ex4_2) {
		System.out.println(ex4_1 + "+" + ex4_2 + "=" + (ex4_1 + ex4_2));
	}

	public static void ex5(int ex5_1, int ex5_2, int ex5_3) {
		System.out.println(ex5_1 + "*" + ex5_2 + "*" + ex5_3 + "=" + (ex5_1 * ex5_2 * ex5_3));
	}

	public static void ex6(int ex6_1, int ex6_2) {
		System.out.println(ex6_1 + "/" + ex6_2 + "=" + (ex6_1 / ex6_2));
		System.out.println(ex6_1 + "/" + ex6_2 + "의 나머지=" + (ex6_1 % ex6_2));
	}

	public static void ex7(String ex7_1_st, String ex7_2_st) {
		System.out.println(ex7_1_st + ex7_2_st);
	}

}