package study;
//변수의 사용영역
//변수는 사용가능한(인식가능한)범위가 존재한다.
//변수의 사용 영역은 해당 변수가 선언된 {}안에서만 가능!
public class VarArea {
	public static void main(String[] args) {
			int a = 5;
			if(a>3){
				int b = 10;
				System.out.println(a);
				System.out.println(b);
			}else {

			}
		System.out.println(a);
//		System.out.println(b); 오류

		/// ////////////////////////////////
		//int num2 = 15;
		//변수의 위치에따라 오류가 날수있음을 인식할것
		//이미 사용중인 변수는 아래에서 사용할 수 없음
		if(10>5){
			int num2 = 5;
		}
		if(3>1){
			int num2 = 10;
		}

		/// ////////////////////////
		for(int i = 0; i<10;i++){
			//for문의 ()안에서 정의된 변수 i는 어디까지 사용가능?
			//for문 안에서만 사용이 가능하다
		}
		for(int i = 0; i<10;i++){
			//그래서 상위 for의 영역과 해당영역이 서로
			//다른 녀석들이다.
		}
		/// ///////////////////
		for(int i = 0; i<10; i++){
			int data = 1;
			System.out.println("data = "+data);
			data++;
			//data는 1이다 출력한다 데이터는 1증가한다
			//data는 1이다 출력한다 데이터는 1증가한다
			//... 와 같이 10번반복됨 10번의 모든 값이 data = 1로 나옴
		}
	}
}
