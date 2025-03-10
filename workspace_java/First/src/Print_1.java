public class Print_1 {
  public static void main(String[] args){
		//소괄호 안의 내용을 출력하는 println+한줄개행
		System.out.println("하이");
		System.out.println("하이");
		//소괄호 안의 내용을 출력하는 print
		System.out.print("하이");
		System.out.print("하이");

		//아무것도 출력은 안하지만 엔터치겠다
		System.out.println();
		//숫자를 출력할때는 ""를 사용하지않음
		//문자를 출력할때는 ""가 무조건 필요함

		//즉 System.out.println(5); 는 숫자 5고
		//즉 System.out.println("5"); 는 문자 5임
		//서버 db로 넘길때의 값의 형태가 다름
		System.out.println(5);
		System.out.println("5");

		//결과값이 각각 10과 "55임"
		System.out.println(5+5);
		System.out.println("5+5");
	}
}
