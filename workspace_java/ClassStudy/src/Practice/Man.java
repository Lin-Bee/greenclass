package Practice;

public class Man {
	String name;
	int age;
	String arr;

	public void setMemberInfo(String name, int age, String arr){
		this.name=name;
		this.age=age;
		this.arr=arr;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setArr(String arr){
		this.arr = arr;
	}

	public String reSetName(String name){
		return name;
	}
	public int reSetAge(int age){
		return age;
	}
	public String reSetArr(String arr){
		return arr;
	}

	public void printAll(){
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+arr);
	}
}
