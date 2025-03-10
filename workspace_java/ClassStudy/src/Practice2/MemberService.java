package Practice2;

public class MemberService {
	private String mbId;
	private String mbPass;

	public String getMbId() {
		return mbId;
	}

	public void setMbId(String mbId) {
		this.mbId = mbId;
	}

	public String getMbPass() {
		return mbPass;
	}

	public void setMbPass(String mbPass) {
		this.mbPass = mbPass;
	}

	public boolean login(String id, String password){
		//id가 hong 비번이 12345 true
		return id.equals("hong")&&password.equals("12345");
	}

	public void logout(String id){
		System.out.println("로그아웃되었습니다.");
	}

}
