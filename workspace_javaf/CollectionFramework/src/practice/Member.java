package practice;

public class Member {
	private String id;
	private String password;
	private String name;
	private int age;

	public Member(){}
	public Member(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	@Override
	public String toString() {
		return "Member{" +
						"id='" + id + '\'' +
						", password='" + password + '\'' +
						", name='" + name + '\'' +
						", age=" + age +
						'}';
	}
}
