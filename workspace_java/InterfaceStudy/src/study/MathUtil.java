package study;

public interface MathUtil {
	//아래 인터페이스에서 제시한 메서드를 구현하는 클래스를 만들고
	//요구사항에 맞는 메서드를 구현!

	//매개변수로 전달된 세 정수의 합이 짝수이면서
	//(a+b+c)%2==0 && (a+b+c)%5==0 ?true:false
	//그 합이 5의 배수일 경우 true리턴
	public boolean isEven(int a, int b, int c);

	//1부터 매개변수로 받은 정수까지의 합을 리턴
	//for (int i = 1; i < num+1 ; i++) {
	//			int sum = sum+i
	//		}
	public double getSumFromOne(int num);

	//매개변수로 넘어오는 반지름rad를 갖는 원의 넓이 리턴
	//단, 매개변수로 넘어온 반지름이 음수라면 원의 넓이는 0으로 리턴
	public double getCircleArea(int rad);
	//파이 rad의제곱
	//if(rad>=0){
	// int circle = ((rad*rad)*3.14)
	// }else{sout"숫자가 음수라 원의 넓이계산불가 0이다"}
}
