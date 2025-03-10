public class DataType2 {
	public static void main(String[] args) {
	//문자데이터 char
		char a = '가';
		System.out.println(a);

		char num = 'A';
		System.out.println(num);
		int num2 = 'A';
		System.out.println(num2);

		System.out.println("char num = " + num); // A
		System.out.println("int num2 = " + num2); //A는 컴퓨터에서 유니코드 65

		// 만약에 글자수가 2개이상일 경우
		// java: unclosed character literal

	}
}
