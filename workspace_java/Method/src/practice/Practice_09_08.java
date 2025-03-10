package practice;

public class Practice_09_08 {
	public static void main(String[] args) {
		//세 정수를 매개변수로 받아,
		// 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.
		int a =6;
		int b =9;
		int c =1;
		System.out.println(ex08(a,b,c));
	}
	public static double ex08(int a, int b, int c){
		double avg = (a+b+c)/3;
		return avg;
	}
}
