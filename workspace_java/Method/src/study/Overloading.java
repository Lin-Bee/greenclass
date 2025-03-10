package study;

//메서드 오버로딩
//메서드 명은 원래는 중복되면 안됨 : 불가능함
//메서드의 매개변수 정보(자료형or갯수)가 다르면
// 중복된 이름으로 작성을 허용한다.
public class Overloading {
	public static void main(String[] args) {
		println(3);
	}
	//문자열 출력메소드
	public static void println(String str){
		System.out.println(str + 1);
	}
	//정수형 출력메소드
	public static void println(int num){
		System.out.println(num + 2);
	}

}
