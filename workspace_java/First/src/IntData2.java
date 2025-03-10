import java.util.Scanner;

public class IntData2 {
	public static void main(String[] args) {
		//키보드 입력을 받기 위한 변수(복사해서 사용!)
		Scanner sc = new Scanner(System.in);
		//두 정수를 키보드로 입력받아,
		//입력받은 두 수의 합을 출력

		System.out.println("첫번째 정수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int b = sc.nextInt();

		System.out.println("입력하신 두 수" + a + "와" + b + "의 합은" + (a + b));
	}
}
