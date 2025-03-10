package study;

public class StudentTest {
	public static void main(String[] args) {
		//Student 클래스 객체 stu1생성
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();

		stu1.stName = "홍길동";
		stu1.stAge = 20;
		stu1.stScore = 55;

		stu2.setStName("맛고기");
		stu2.setStAge(1);
		stu2.setStScore(100);

		stu3.setInfo("홍두께",5,99);


		System.out.println(stu1.stName+"("+stu1.stAge+")"+stu1.stScore+"점");
		stu1.printInfo(); //<printIntfo로 만들어둠
		System.out.println("");
		stu2.printInfo();
		System.out.println("");
		stu3.printInfo();
	}
}
