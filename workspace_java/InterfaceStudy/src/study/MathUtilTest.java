package study;

public class MathUtilTest {
	public static void main(String[] args) {
		MyMathUtil m1 = new MyMathUtil();
		boolean test1 = m1.isEven(5,5,10);
		double test2 = m1.getSumFromOne(5);
		double test3 = m1.getCircleArea(4);

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
	}
}
