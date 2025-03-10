package Practice;

public class ManTest {
	public static void main(String[] args) {
		//6) Man 클래스로 객체를 만들어 위에서 만든 메소드가 잘 작동되는지 테스트하세요.*/
		Man man = new Man();
		man.setMemberInfo("고길통",50,"울산남구");
		man.printAll();
		//▲내가 한거 ▼쌤이랑하는거
		System.out.println("");
		Man2 m1 = new Man2();
		m1.setName("홍길동");
		m1.setAge(4);
		m1.setAddress("대시 핑구 연어길");
		m1.printInfo();
		//이름 데이터만 출력할때
		System.out.println("");
		System.out.println(m1.name); //m1의 이름 혹은
		System.out.println(m1.getName()); //getter로 받아온 name모두가능
	}
}
