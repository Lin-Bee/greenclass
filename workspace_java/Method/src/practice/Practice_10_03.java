package practice;

public class Practice_10_03 {
	public static void main(String[] args) {
		//Math.random() 메소드를 활용하여
		// 1~ 50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고
		//호출해보자.
		lotto();
		System.out.println(lotto());
	}
	public static int lotto(){
		int num = (int)(Math.random()*50+1);
		return num;
	}
}
