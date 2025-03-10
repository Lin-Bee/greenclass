public class Switch_3 {
	public static void main(String[] args) {
		/*
		* 0~100사이의 임의의 정수를 변수에 저장
		* 90이상~100까지는 문자열 a를 출력
		* 80~90까지는 문자열 b
		* 70~80까지는 문자열 c
		* 60~70까지는 문자열 d
		* */
		int score = 71;

		switch (score/9){
			case 10:
			case 9:
				System.out.println("학점 A");
				break;
			case 8:
				System.out.println("학점 B");
				break;
			case 7:
				System.out.println("학점 C");
				break;
			case 6:
				System.out.println("학점 D");
				break;
			default:
				System.out.println("과락");
		}
	}
}
