import java.util.Scanner;

public class If_ElseIf_Else_1 {
	public static void main(String[] args) {
		//조건이 3개이상일때 사용
		//정수가 짝수이면 짝수 출력
		//정수가 홀수이면 홀수 출력
		//정수가 0 이면 제로 출력
		int num;
		System.out.println("숫자를 입력해보시게");
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();;
		if(num%2==0){
			if(num==0){
				System.out.println("제로0");
			}else{
				System.out.println("짝수입니다만");
			}
		}else if(num%2==1){
			System.out.println("홀수입니다만");
		}
	}
}
