package OffLimits1;

public class OrangeTest1 {
	public static void main(String[] args) {
		Orange orange = new Orange();
	// orange.a; - private는 같은 Class에서만 사용가능
	//             다른 클래스에서는 접근 불가
		orange.b=3;
		orange.c=3;
	//orange.aaa(); - private는 같은 Class에서만 사용가능
	//             다른 클래스에서는 접근 불가
		orange.bbb();
		orange.ccc();

		orange.setPrice(100);
	}
}
