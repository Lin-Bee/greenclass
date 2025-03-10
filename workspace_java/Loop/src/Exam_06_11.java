import java.util.Scanner;

public class Exam_06_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int min=0;
		int max=0;
		int sum=0;


		System.out.print("정수 1:");
		a=sc.nextInt();
		System.out.print("정수 2:");
		b=sc.nextInt();
		if(a>b){
			min = b+1;
			max = a;
			System.out.println("큰수"+max+"와 작은수"+ (min-1));
		}else if(a<b){
			min = a+1;
			max = b;
			System.out.println("큰수"+max+"와 작은수"+ (min-1));
		}
		while (min<max){
			sum=sum+min;
			min++;
		}
		System.out.println("숫자의 합은"+sum);
//		for(int i=min;i<max; i++){
//			sum+=i;
//		}
//		System.out.println("숫자들의합은"+sum);
	}
}
