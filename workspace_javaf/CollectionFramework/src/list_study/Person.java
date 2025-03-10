package list_study;

public class Person {
	private String name;
	private int age;
	private String addr;

	public Person(){}

	//자동완성 constructor
	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	//자동완성 getter setter
	public String getName() {return name;	}
	public void setName(String name) {this.name = name;	}

	public int getAge() {return age;	}
	public void setAge(int age) {this.age = age;	}

	public String getAddr() {	return addr;	}
	public void setAddr(String addr) {this.addr = addr;	}

	//자동완성 toString > 다 출력해주는거
	@Override
	public String toString() {
		return "Person{" +
						"name='" + name + '\'' +
						", age=" + age +
						", addr='" + addr + '\'' +
						'}';
	}
}
