package Practice3;

public class PersonInfo {
	//이름, 나이, 주소
	private String name;
	private int age;
	private String addr;

	//초기화용 기본셋팅 constructor
	public PersonInfo(){

	}
	public PersonInfo(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName(){return name;}
	public void setName(String name){this.name = name;}

	public int getAge(){return age;}
	public void setAge(int age){this.age = age;}

	public String getAddr(){return addr;}
	public void setAddr(String addr){this.addr = addr;}

}
