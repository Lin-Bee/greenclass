import java.util.Scanner;

public class If_Else_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키보드로 하나의 정수를 입력받아
		//그 수가 3의 배수이면 '3의 배수입니다'를 출력하고
		//조건에 맞지 않으면 '3의 배수가 아닙니다'를 출력
		int num;

		System.out.println("숫자를 말해보거라");
		num = sc.nextInt();

		if (num%3==0){
			System.out.println("3의 배수이니라");
		}else if(num%2==0){
			System.out.println("2의 배수이니라");
		}else{
			System.out.println("3과 2의 배수가 아니니라");
		}

	}
}
