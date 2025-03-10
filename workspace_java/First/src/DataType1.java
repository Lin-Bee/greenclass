//자료형(data type)
//	자바의 자료형은 크기 기본자료형,참고자료형으로 구분
//기본자료형(primivite type) 8개는 무조건 외워야함
//1.boolean 2.char 3.byte 4.short 5.int 6.long 7.float 8.double
//참조자료형(referance type)은 아주많은 무한


public class DataType1 {
	public static void main(String[] args) {

		//참과 거짓 > true와 false를 표시할때
		boolean home = true;
		boolean company = false;
		System.out.println(home); //true

		//정수
		byte a = 1;
		short b = 1;
		int c = 1;
		long d = 1L; //나그네 - 수가작지만 long이라는걸 알리기위해
		//실수
		double e = 1.5;
		float f = 1.5F;
		//나그네 - 실수는 기본은 double씀 다만 소숫점자리가 작을때 float로 해석

		System.out.println();
		//문자
		char oneSentance = 'a';
		//문자열은 따로
		String s = "String입니다만";
		System.out.println(s);
	}
}
