package study;
/*
* 메서드의 리턴타입
* - 메서드의 실행결과 리턴되는 데이터의 자료형
*   >> 접근제한자 [static] 리턴타입 메서드명(매개변수들)
*      void영역에 들어가던부분이 리턴타입
* - 리턴 : 메서드를 호출하는 곳에 결과값을 되돌려준다.
* - 리턴되는 데이터의 자료형과 메서드의 리턴타입은 일치
* - return명령어는 실제 데이터를 리턴하는 역할을 하며,
*   return 명령어 뒤에는 어떠한 코드도 올 수 없다
*  - 메소드에서 return 명령어는 한번만 실행할 수 있다.
* */
public class Method_5 {
	public static void main(String[] args) {
		int a = aaa(); //5를 출력하지만 리턴한 값은 3이다
		System.out.println(a); //리턴된 3을 출력해라
		qqq();
		double d = Math.random();
	// 자료형 변수  = 클래스.메서드();

		bbb(10,20); // 이ㅔㄱ 되긴한데 아래 int처럼 형 선언해주기
		int sum = bbb(10,20); //리턴되는 데이터는 계속 받아쓸수있다
		System.out.println(sum);

	}

	//return 명령어를 한번만 실행할 수 있다의 의미
	public static int ccc(){
		int a = 5;
		int b = 10;
		//두수중 큰수를 리턴하세요
		if(a>b){
			return a;
		}else {
			return b;
		}


	}

//	public static String ac(){
//		String name = "java";
//		if(name.equals("java")){ //equals < 참또는 거짓을 판별하는 boolean
//			System.out.println("옳다");
//		}else{
//			System.out.println("틀리다");
//
//		}
//	}

	//매개변수로 전달된 두수의 합을 리턴하는 메서드
	public static int bbb(int a,int b){
		return a+b;
	}

	public static void qqq(){ // 형이없다
		System.out.println("값이없다");
	}
	public static int aaa(){
		System.out.println(5); // 출력하겠다

		return 3;		//메서드 실행 후 3을 리턴하겠습니다.
	}
}
