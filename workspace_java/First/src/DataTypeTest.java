public class DataTypeTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println("a + b + c = " + (a+b+c));
		//or
		int result = a+b+c;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("a + b + c = " + result);

		System.out.println("a =" + "1" + "문제는 없지만 int임");
		System.out.println("b =" + "1.0" + "문제는 없지만 bollean임");

		//강제형변환 사용시 (변수)를 추가하여 정정
		int num1;
		double num2 = 10.7;
		num1 = (int)num2;
		System.out.println(num1);

		//각자가 가지고 있는 데이터의 값 변경하는 방법
		int swc1 = 10;
		int swc2 = 20;
		System.out.println("swc1 = " + swc1);
		System.out.println("swc2 = " + swc2);

		int swc3 = swc2;
		swc3=swc1;
		swc1=swc2;
		swc2=swc3;

		System.out.println("swc1 = " + swc1);
		System.out.println("swc2 = " + swc2);

	}
}
