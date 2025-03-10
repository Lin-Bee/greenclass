package StaticStudy;

public class MySystem {
	static Myout out;
	//      ▲
	//     │
	//    기본형이아닌 형일경우 가능
	class Myout{
		public void println(){}
	}
}

/*

클래스,객체,인스턴스
객체 생성문법, 생성자
맴버변수,메서드 정의 및 활용법
this키워드,getter,setter,static,접근제한자
***클래스는 자료형이다(사용자 정의자료형)

기본자료형 > 데이터하나를 저장.읽기
배열 > 여러 데이터를 저장(※ 하나의 데이터긴 함)
       같은 자료형을 여러개 저장하고 읽기가능
클래스 > 여러 자료형을 저장하고 읽기
         - 사용을 위해 setter와 getter이용
*/
