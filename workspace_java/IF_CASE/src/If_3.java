import java.util.Scanner;

public class If_3 {
	public static void main(String[] args) {
		//키보드로 정수 두개를 입력받아
		//입력받은 두수의 합이 10이상이면서
		//짝수는 아닐 경우에만 "참"이라는 문자열 출력
		Scanner sc= new Scanner(System.in);

		int num1, num2;

		System.out.print("1번 정수 : ");
		num1 = sc.nextInt();

		System.out.print("2번정수 : ");
		num2 = sc.nextInt();

		if(num1+num2>=10 && (num1+num2)%2!=0){
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}

	}
}
