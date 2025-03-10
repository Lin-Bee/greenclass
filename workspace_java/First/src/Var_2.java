public class Var_2 {
	public static void main(String[] args) {
		//변수는 필요하면 여러개 사용할 수 있다.
		int num1; //변수선언
		num1 = 10;

		int num2;
		num2 = 20;
		//int num2; 변수명은 중복불가

		//num1변수와 num2변수에 저장된 정수의 합을 출력
		System.out.println(num1 + num2); //30
		System.out.println("num1 + num2 =" + num1 + num2); //num1+num2=1020
		System.out.println("num1 + num2 =" + (num1 + num2)); //num1+num2=30

	}
}
