public class Operate1 {
	public static void main(String[] args) {
	//산술 연산자(+, -, *, / , %)
	//'%' : mod(모드)연산자 : 나눗셈의 나머지
		System.out.println(6 % 2);
		System.out.println(8 % 3);
		System.out.println();

		//정수끼리의 연산은 무조건 정수로 나옴
		System.out.println(8 / 3);
		System.out.println(8 / 3.0);

		int a = 8;
		System.out.println((double) a/3); //casting은 여기에줌
		System.out.println();

		//비교연산자 (>, < , >= , <= , == , !=)
		// 크다 작다 크거나같다 작거나같다 같다 다르다
		System.out.println(5>1);
		System.out.println(3 == 3);

		//복합대입연산자
		int num = 3;

		//num이 가진 값을 1증가 시키는 코드
		num = num + 1;
		num += 1; //복합대입연산자라고 하는애
		//위랑 같음
		System.out.println(num);

		num*=3; //num은 num*3이다
		System.out.println(num);

		num-=4;//num은 num-4이다
		System.out.println(num);

		num/=2;//num은 num/2이다
		System.out.println(num);

		num%=2;//num은 num/2이다
		System.out.println(num);

		//논리연산자
		//and 연산자 - && 그리고
 		//or 연산자 - || 이거나 < 버티컬바가 or
		System.out.println(3>1&&2<4); // true
		System.out.println(1==1&&2>1||3>5&&1<4);
										//(1==1&&2>1)||(3>5&&1<4)
		//&&와 ||연산이 같이 있을때 &&이 우선순위가 높음
		//&&와 &의 차이
		//||와 |의 차이


	}
}
