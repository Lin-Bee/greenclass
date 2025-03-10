import java.util.Scanner;

public class Exam_1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		
		if(num%2==0){
			if(num==0){
				System.out.println("0은 0입니다");
			}else{
				System.out.println("짝수입니다");
			}
		}else if(num%2==1){
			System.out.println("홀수 입니다");
		}
	}
}
