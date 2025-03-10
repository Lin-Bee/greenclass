package study;
/*메서드(Method):반복사용되는 기능을 하나의 기능상자로 표현한 것
타 프로그램의 함수 function 같은 친구

메서드 사용 방법
1. 메서드를 정의(하고 싶은 기능을 정의) < class안 또다른 메서드밖
 - 메서드의 정의는 클래스 안 그리고 메서드 또다린 메서드 밖에서 작성
 - 메서드의 정의 문법
 - 접근제한자 [static] 리턴타입 메서드명(매개변수들){
 		메서드의 내용 작성
	 }
	 <<<메서드명은 중복되면안됨
 -	ex)public/private/등등 [static] ex)void ex)main(매개변수){
 		메서드의 내용 작성
	 }
	 *접근제한자는 일단 무조건 public으로 사용
	 *접근제한자 뒤에는 일단 static키워드를 사용
	 *메서드명은 소문자로 작성
	 *메서드는 필요한 만큼 다수정의가능

2. 정의된 메서드를 호출(사용)
	-	정의된 메서드를 사용하기 위해서는 메서드 호출을 해야하는데
	 ★★ 호출을 하려면 정의한 메서드명과 동일해야하고
	★★ 동시에 매개변수 정보(매개변수의 자료형)가 동일해야함
	                        or (매개변수의 갯수)

*/
public class Method_1 {
	public static void main(String[] args) {
		//printHello() 메서드를 호출
		printHello();

		System.out.println("프로그램종료");
	}
	//안녕하세요를 출력하는 매서드의정의
	public static void printHello(){
		System.out.println("안녕하세요");
	}
}
