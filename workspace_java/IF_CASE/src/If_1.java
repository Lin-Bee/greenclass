//조건문: if
//조건이 맞을 때만 코드를 실행하는 문법
/*
*  if라는 키워드를 사용함
*  if(참 or 거짓 판단할 수 있는 조건){
* 		실행코드...
* 		실행코드...
* 	}
* */
public class If_1 {
	public static void main(String[] args) {
		System.out.println("시작");

		int num = 3;
		if(num == 3){ //if문은 조건부터 해석한다
			System.out.println("참");
			System.out.println("참");
			System.out.println("참");
		}else{
			System.out.println("잘못된조건.거짓");
			System.out.println("잘못된조건.거짓");
			System.out.println("잘못된조건.거짓");
		}
		//if문은 중괄호가 생략될 수 있다
		//조건에 따른 실행코드가 하나라면 중괄호 생략 가능
		if(num>5) {
			System.out.println("5보다 크니?");
		}


		System.out.println("끝");
	}
}
