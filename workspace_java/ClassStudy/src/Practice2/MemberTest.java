package Practice2;

public class MemberTest {
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();

		m1.setMbName("자바");
		m1.setMbId("java");
		m1.setMbPass("123");
		m1.setMbAge(50);
		m1.displayInfo();

		//정답은 얘임
		m2.nameIdChange("고기","GOGI");
		m2.displayInfo();

		m1.setMbName("자바");
		m1.setMbId("java");
	}
}
