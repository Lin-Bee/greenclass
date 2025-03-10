import java.util.Scanner;

public class Exam_1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("3의 배수인지 확인하기위한 숫자를 입력하시오");
		num=sc.nextInt();

		if(num%3==0) System.out.println("3의 배수입니다");
	}
}
