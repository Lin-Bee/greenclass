package study;

public class SamsungTV implements Tv{
	@Override
	public void trunOn() {
		System.out.println("삼성티비-전원 켬");
	}

	@Override
	public void trunOff() {
		System.out.println("삼성티비-전원 끔");
	}

	@Override
	public void volumeUp() {
		System.out.println("삼성티비-소리좀 키워봐봐");
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성티비-소리가 너무커 줄여라");
	}
}
