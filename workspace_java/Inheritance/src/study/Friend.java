package study;

public class Friend {
	private String name;
	private String tell;

//	public Friend() {}
	public Friend(String name, String tell) {
		this.name = name;
		this.tell = tell;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}

	public String getTell() {	return tell;}
	public void setTell(String tell) {this.tell = tell;	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + tell);
	}

}
