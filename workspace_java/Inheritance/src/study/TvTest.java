package study;

public class TvTest {
	public static void main(String[] args) {
		//객체(object)뒤에 .을 작성하면 자동으로 나타나는 메서드들은
		//상속을 통해 물려받은 내용이다.
		//사실상 Object는 '모든클래스'가 상속받는중

		Tv tv = new Tv();
		System.out.println(tv.toString()); //이거슨티비다
		tv.turnOn(); //티비전원켜짐
		tv.toString(); // 출력 x
		//tv.eat(); //치즈케익을 먹어
		          //extends CheeseCake 을 해와서그럼 이제 x
	}
}
