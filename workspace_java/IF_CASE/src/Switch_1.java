/*
* switch case break 문
*
* */
public class Switch_1 {
	public static void main(String[] args) {
		int num = 2;

	//switch(★){} ★에는 특정 값이 들어옴
	//★ 이 case 인 경우 어떤걸 하겠습니다.
	//조건에 맞는것 부터 모두 실행
	//default : 그 외 전부;
	//break; 를 이용해서 끊어준다

	//if문은 조건이 범위 일때 사용하기 좋음(손익계산서-기간)
	//swite문은 조건이 특징이라면 (재무재표)
		switch (num){
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println("고");
				System.out.println("기");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println(4);
		}
	}
}
