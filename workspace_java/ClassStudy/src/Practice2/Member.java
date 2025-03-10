package Practice2;

public class Member {
	/* 1. Member 클래스는 필드로 이름, 아이디, 비밀번호를 갖는다.
	 모든 필드를 선언하고, 기본 생성자와 클래스의 모든 데이터를 변경할 수 있는 생성자를 만드시오.
*/
	private String mbName;
	private String mbId;
	private String mbPass;
	private int mbAge;

	public Member(){
		String mbName ="";
		String mbId ="";
		String mbPass ="";
		int mbAge = 0;
	}

	/*2. 각 필드에 대한 setter와  getter를 만들어라.*/

	public String getMbName() {
		return mbName;
	}

	public void setMbName(String mbName) {
		this.mbName = mbName;
	}

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

	public int getMbAge(){return mbAge;}
	public void setMbAge(int mbAge){
		this.mbAge = mbAge;
	}

	public void nameIdChange(String mbName, String mbId){
		this.mbName = mbName;
		this.mbId = mbId;
	}

	/*3. 모든 필드의 값을 출력하는 displayInfo() 메소드를 만들어라.*/
	public void displayInfo(){
		System.out.println("이름 : " +getMbName());
		System.out.println("아이디 : " +getMbId());
		System.out.println("비번 : " +getMbPass());
		System.out.println("나이 : " +getMbAge());
	}

	/*4. 실행 클래스를 만들어 이름을 ‘자바’,
	 아이디는  ‘java’,
	 비밀번호는  ‘123’으로 변경하고 출력메소
	드를 사용하여 결과를 확인하여라.*/


}
