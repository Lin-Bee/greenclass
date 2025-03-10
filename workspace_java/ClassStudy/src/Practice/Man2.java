package Practice;
/*아래의 문제를 풀면서 사람을 표현하는 Man 클래스를 만들어보자.
.*/
public class Man2 {
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
	//일괄생성하는 방법 select field to generator
	//마우스 우클릭 >GENERATE > getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//5) 맴버변수의 모든 정보를 출력하는 메소드를 만드세요.
	public void printInfo(){
		System.out.println("이름" + this.name); // 이것도
		System.out.println("나이" + getAge()); //이것도
		System.out.println("주소" + address); //이것도됨
	}
}
