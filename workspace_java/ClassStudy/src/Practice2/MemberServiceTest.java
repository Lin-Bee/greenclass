package Practice2;

public class MemberServiceTest {
	public static void main(String[] args) {

		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong","12345");
		if(result){
			System.out.println("로그인되었습니다");
			memberService.logout("hong");
		}else {
			System.out.println("아이디나 비번이 틀렸음");
		}
	}
}
