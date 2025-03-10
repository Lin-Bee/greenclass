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
public class Method_3 {
	/*매개변수가 있는 메서드
	 매개변수 : 메서드의 정의 부분에 ()영역에 작성한 변수를 매개변수
	 매개변수가 하는 역할 : 메서드 내에서 기능을 구현할때
	                        특정데이터가 필요하다면, 그데이터를
	                        매개변수로 작성~!
	 */
	public static void main(String[] args) {
		for(int i=0; i<3; i++){
			printNum(i);
		}
		System.out.println("");
		printNum(5);
		printNum(10);

		//매서드 선언시 매개변수의 자료형과 메서드 호출시 사ㅛㅇㅇ한
		//매개변수 자료형이 다르면 오류;
		printNum(15);
		//printNum("java"); 오류
		//매개변수의 갯수가 달라도 오류
		//printNum(5,6); 오류


		System.out.println("");

		ourClass();
	}

	public static void printNum(int num){
		System.out.println(num);
	}








	public static void ourClass(){
		String[] student = new String[3];
		String[] name = {"","ㅁㅎ","ㅎㄱ","ㄹㅁ","ㄷㅇ","ㅇㅇ","","ㅅㅎ","ㄱㅈ","","ㄴㄱ","ㅎㅇ","ㄷㅇ","ㅈㅎ","ㅅㄹ","ㅁㅈ","","ㅇㅇ"};
		String[] age = {"","6","2","4","1+","4","","6","7","","4","9","6","4","6-","6-","","2"};
		String[] major = {"","컴","디","예","기","?",""," 건","공","","디","제","?","?","영","건","","유"};

		for(int i = 0; i<name.length; i++){
			System.out.println(name[i]+" | "+age[i]+" | "+major[i]);
			if(i%3 == 2){
				System.out.println("");
			}
		}
	}
}
