import java.util.Scanner;

public class StringData2 {
	public static void main(String[] args) {
		//문자열 입력받기
		//키보드 입력을 받기 위한 변수(복사해서 사용!)
		Scanner sc = new Scanner(System.in);

		//이름과 주소를 입력
		System.out.print("이름을 입력하세요");
		//string(문자열형태를) name(이라는 변수에 담는다) = sc.next()에 친것을
		String name = sc.next();

		System.out.println("주소를 입력하세요");
		String addr = sc.next();

		System.out.println("");
		System.out.println("당신의");
		System.out.println("이름은" + name + "입니다");
		System.out.println("주소는" + addr + "입니다");

	}
}
