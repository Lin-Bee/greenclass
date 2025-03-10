//변수(Variable)
//값 [하나]를 저자할 수 있는 공간
//변수를 사용하기 위해서는

//1. 변수의 선언과
//	변수의 선언문법 : 자료형 변수명;
//	자료형 : 자료의형태
//2. 변수의 초기화 작업이 필요하다
//	변수 선언 후 최초에 값을 할당(저장)하는 행위
//

//변수명 정의법
//변수명은 소문자로 작성하는(관례)
//변수명은 명확해야하고, 복합어의 경우 카멜케이스(camel Case)로 작성한다
//Class명은 앞글자는 무조건 대문자이다.
public class Var_1 {
	public static void main(String[] args) {
		//num이라는 변수의 선언
		//int -> interger(정수)
		int num; //정수를 저장할 공간 num을 선언하개따!!!
		//변수에 데이터를 저장
		// '=' : 우측을 왼쪽에 저장~
		num = 5; // 변수의 초기화 : 5를 num이라는 변수에 저장한다
		System.out.println(num);
		System.out.println("한번은 값을 넣고 쓰고 여까지는 5인데");
		num = 10;
		//출력문의 소괄호 안에 변수명을 넣으면 변수에 저장된 값을 출력
		System.out.println(num);
		System.out.println("num = 10을 선언하는 쟤부터 10이되는거임");

	}
}
