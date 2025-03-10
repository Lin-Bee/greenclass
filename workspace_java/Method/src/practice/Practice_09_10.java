package practice;

public class Practice_09_10 {
	public static void main(String[] args) {
		String s = "고기는";
		ex10(s);
		System.out.println(ex10(s));
	}
	//매개변수로 문자열 데이터 하나를 받아,
	// 해당 문자열의 길이가 짝수 일 때는 true를 리턴하고,
	//홀수 일 때는 false를 리턴하는 메서드를 선언하고 사용해보세요
	public static boolean ex10(String s){
		int a = s.length();
		return a%2==0;
	}
}
