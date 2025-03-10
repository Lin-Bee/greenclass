package study;

public class StudentTest2 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.stName="지바고";
		stu1.stAge=500;
		stu1.stScore=90;
		stu1.printInfo();
		//쓰지마셈

		System.out.println();
		Student stu2 = new Student();
		stu2.setStName("홍");
		stu2.setStAge(24);
		stu2.setStScore(45);
		stu2.printInfo();

		System.out.println();
		Student stu3 = new Student();
		stu3.setInfo("장",45,80);
		stu3.printInfo();
	}
}
