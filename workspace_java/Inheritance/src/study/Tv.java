package study;

//다형성:부모클래스로 자식 클래스의 객체생성가능

//클래스가 명시적으로상속받지않으면
// 자동으로 Object클래스를 상속 받음 < 모든클래스가 상속받는중
//모든 클래스의 객체는 Obvect로 다 받을수있다
public class Tv{
	public void turnOn(){
		System.out.println("티비전원 켜짐");
	}

	//Object 클래스의 toString() 메서드 오버라이딩
	//@Override : 메서드가 오버라이딩 문법에 맞는지 확인도 해줌
	//현재 string이므로 toString(int a) 가 되면 오류가 발생함
	@Override
	public String toString() {
		return "이거슨 티비다";
	}

}
