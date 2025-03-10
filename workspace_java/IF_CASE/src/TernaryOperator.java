import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		int a = 3;
		int b;
//	삼항연산자가 있으면 아래 if문을 한줄로 바꿀 수 있음
//		if(a>5){
//			b=1;
//		}else{
//			b=2;
//		}

		//아래 코드를 통해 위와 동일한 삼항연산자를 알아 봅시다
		//b 는 ?뒤의것이다
		//a가 5보다 클때
		//참일때 : 거짓일때
		b=a>5?1:2;

		//삼항연산자의 기본 문법
		//참또는 거짓을 판별하는 조건 ? 참일때 실행내용 : 거짓일때 실행내용;
		System.out.println(b);


		//num이 5이면"참" 출력, 그렇지 않으면 거짓 출력
		int num = 5;
		String Boolean;
		//삼항연산자
		Boolean=num==5?"참":"거짓";
		System.out.println(Boolean);

		int num1 = 3;
		int num2 = 7;
		int min = num1>num2 ? num2:num1;
		int max = num1>num2 ? num1:num2;

		//큰 수는 max에 저장하고, 작은수는 min이라는 변수에 버방
		System.out.println("min = "+min);
		System.out.println("max = "+max);



	}
}
