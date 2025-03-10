package Practice;

public class MemberTest {
	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		
		member1.setMbName("김이름");
		member1.setMbId("idda");
		member1.setMbPass("passwordda");
		member1.setMbAge(6);

		member1.prinInfo();
		System.out.println();

		member2.MbInfo("이이름","dkdlel","qlqjsdlek",50);

		member2.prinInfo();

	}
}
