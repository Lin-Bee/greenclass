public class Operate2 {
	public static void main(String[] args) {
		//증감연산자(++,--) 값을 1 증가, 감소
		int a = 5;
		int b = 5;
		int c = 5;
		//전위, 후위 증감 연산자를 사용하여 a의값을 증가
		++a; // 다르게쓰기 a= a+1;  다르게쓰기  a+=1;
		a++; // 다르게쓰기 a= a+1;  다르게쓰기  a+=1;
		System.out.println("a =" + a);

		--a;
		a--;
		System.out.println("a =" + a);
		//전위증감연산자와 후위 증감 연산자는
		//단독으로 사용하면 해석차이가 없지만 단독사용이 아닐시 해석순서가 달라짐

		System.out.println(b++); //b출력 후 +1하세용
		System.out.println(b); //b출력하세욤
		System.out.println(++b); //+1하고 나서 b출력하세용
		System.out.println();
		System.out.println(++c);
		System.out.println(c);

		int x = 10; //x는 10
		int y = x++; //y=10 x=11이됨
		x=x+5; // x = 11+5
		System.out.println("x="+x); //x = 16
		System.out.println("y="+y); //y = 10
		//★순서를 잘 기억해 두도록하세용★

		// = 은 대입연산자
		int value = 10;
		System.out.println(value++);
		System.out.println(value++);

		//연산자 우선순위
		//&& 연산자가 || 연산자보다 우선순위가 높다.
		//대입연산자(=)가 가장 우선순위가 낮다.
		//** 예외는 후위연산자가 있을경우
		//헷갈리는 우선순위는 괄호쓰세욤
	}
}
