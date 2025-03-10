package study;

public class Method_4 {
	//매개변수가 두개있는 경우
	public static void main(String[] args) {
		printSum(5 ,4 );
	//메소드동일 | 자료형과갯수
		//printSum(10); 매개변스 갯수불일치
		//printSum("고기","집"); 매겨변수 자료형불일치
	//아아 ㅇㅋㅇㅋ 이게 위에 들어가면자동 연산됨
	}

	//두수의 합을 출력하는 메서드 정의
	public static void printSum(int num1, int num2){
		System.out.println(num1+num2);
	}
}
