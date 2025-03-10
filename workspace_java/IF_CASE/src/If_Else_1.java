import java.util.Scanner;

public class If_Else_1 {
	public static void main(String[] args) {
		//정수가 짝수이면 1을 출력, 그렇지 않으면 2를 출력
		Scanner sc= new Scanner(System.in);
		int x;

		System.out.println("숫자 써봐 go");
		x= sc.nextInt();


		if(x%2==0){
			System.out.println("짝수이다");
		}else{
			System.out.println("홀수이다");
		}

	}
}
