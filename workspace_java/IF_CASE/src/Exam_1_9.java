import java.util.Scanner;

public class Exam_1_9 {
	public static void main(String[] args) {
		int a, b;
		int min = 1;
		int max = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수:");
		a = sc.nextInt();
		System.out.print("두번째 수:");
		b = sc.nextInt();

//		if(a>b){
//			System.out.println(a+">"+b);
//		}else if(a<b){
//			System.out.println(b+">"+a);
//		}else if(a==b){
//			System.out.println(a+"="+b);
//		}

		//좀 더 개선합시다 :)
		if(a>b){
			min = b;
			max = a;
		}else{
			min = a;
			max = b;
		}
		System.out.println(max+">"+min);

	}
}
