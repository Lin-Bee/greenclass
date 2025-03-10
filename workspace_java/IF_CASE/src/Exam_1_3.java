import java.util.Scanner;

public class Exam_1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("a를 입력하세요");
		a = sc.nextInt();
		System.out.println("b를 입력하세요");
		b = sc.nextInt();


		if(a>b){
			System.out.println("a가 큽니다");
		}else if(a<b){
			System.out.println("b가 큽니다");
		}else if(a==b){
			System.out.println("같습니다.");
		}
	}
}
