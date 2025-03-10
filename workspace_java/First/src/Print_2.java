public class Print_2 {
	//main 하고 enter 치면
	// main내부를 호출하는 staic 자동생성
	public static void main(String[] args) {
		//sout + enter 하면 나옴
		//소괄호 안의 내용이 연산이 가능하면 연산결과가 나옴
		//string값이 num이 됨
		System.out.println(5+5);
		//""내부에 작성된 모든 내용은 string값이 문자라서 그냥 나옴
		System.out.println("5+5");
		//string값이 다른 값들은 나열값으로 나타난다.
		System.out.println(3+"3");
		System.out.println(3+"삼");
		System.out.println("hi"+", "+"hello");
		System.out.println(3+5+"a"+5); //8a5
	}
}
