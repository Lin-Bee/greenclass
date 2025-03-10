package Practice;

public class Member {
	String mbName;
	String mbId;
	String mbPass;
	int mbAge;

	public void setMbName(String name1){
		mbName = name1;
	}
	public void setMbId(String id1){
		mbId = id1;
	}
	public void setMbPass(String pass1){
		mbPass = pass1;
	}
	public void setMbAge(int age1){
		mbAge = age1;
	}

	public void MbInfo(String name1, String id1, String pass1, int age1){
		mbName = name1;
		mbId = id1;
		mbPass = pass1;
		mbAge = age1;
	}

	public void prinInfo(){
		System.out.println("이름"+mbName);
		System.out.println("아이디"+mbId);
		System.out.println("비번"+mbPass);
		System.out.println("나이"+mbAge);
	}

}
