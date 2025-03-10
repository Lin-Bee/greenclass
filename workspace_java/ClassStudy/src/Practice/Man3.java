package Practice;

public class Man3 {
	//1) Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버변수를 선언하세요
	String name;
	int age;
	String address;

	//2) 맴버변수의 모든 값을 초기화 할 수 있는 메소드를 만드세요
	public void initMember(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	/*
		3) 맴버변수 각각의 값을 변경하는 메소드를 3개를 만드세요.
		setter 만드세요 > 데이터의 값을 변경시키는 메서드
		setter -> 멤버변수 '하나'의 값을 변경시키는 메서드
					 -> setter 메서드는 이름이 정해져있음(set 맴버변수명)
	*/
	public void setName(String name){this.name=name;}
	public void setAge(int age){this.age=age;}
	public void setAddress(String address){this.address=address;}
	//setter는 값만바꾸고 리턴하는게 없어서 다 void임

	//4) 각 맴버변수의 값을 리턴하는 메소드를 3개 만드세요.
//setter의 단짝 친구 getter 일단 리턴해야하니깐 void가 아닌 각각의 값이어야함
	public String getName(String name){return name;}
	public int getAge(int age){return age;}
	public String getAddress(String address){return address;}

	//5) 맴버변수의 모든 정보를 출력하는 메소드를 만드세요.
	public void printInfo(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
}
