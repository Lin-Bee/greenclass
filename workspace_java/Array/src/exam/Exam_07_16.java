package exam;
/*
*  Math.random(); 이라는 메소드가 있다.
* 이 메소드는 0 ~ 1까지 사이의 실수 중 랜덤한 수
를 전달해준다.
* 예를 들어 double d = Math.random();을 하면
*  0.0 <= d < 1 중 임의의 실수 값이 d에 할당된다.
*
* 이를 활용하여 정수형 변수 I에 50 <= I < 100 의 임의의 정수를 저장해보라.(배열문제아님)
* */
public class Exam_07_16 {
	public static void main(String[] args) {
		double r = Math.random();
		System.out.println(r);

		//0~10까지의 랜덤한 정수를 생성
		//0 <= X <11.0
		int d = (int)(Math.random()*11);
		System.out.println(d);

	}
}
