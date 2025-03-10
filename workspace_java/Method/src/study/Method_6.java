package study;

public class Method_6 {
	public static void main(String[] args) {
		String a = test1(6);
		System.out.println(a);
	}

	//매개변수로 정수 하나를 전달받아
	// 전달받은 정수가 짝수라면
	//"짝수"라는 문자열 리턴
	//홀수라면 "홀수"리턴하기
	public static String test1(int num){
		String result ="";
		if(num%2==0){
			result = "짝수";
		}else{
			result = "홀수";
		}
		return result;
	}
}
