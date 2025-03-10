import java.util.Scanner;

public class Exam_2_1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("변1의 길이:");
		a=sc.nextInt();
		System.out.println("변2의 길이:");
		b=sc.nextInt();
		System.out.println("변3의 길이:");
		c=sc.nextInt();

		if(a+b>c && a+c>b && b+c>a){
			System.out.println("가능");
		}else{
			System.out.println("삼각형이 될 수 없다");
		}

	}
}
