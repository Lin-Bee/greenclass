package study;

public class UnivFriend extends Friend{
	private String major;

	public UnivFriend(String name, String tell, String major) {
		super(name, tell); // 상속할 경우 기본적으로 생성자내부에 불러오고 있음
		this.major = major;
	}

	public void showInfo(){
		super.showInfo(); //본인거불러감
		System.out.println("전공 : "+major);
	}
}
