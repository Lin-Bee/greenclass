package Practice2;

public class WorkerTest {
	public static void main(String[] args) {
		Worker w1 = new Worker();

		w1.company = "그린컴퓨터";
		w1.dept = "행정";

		w1.personInfo.age = 0;

		System.out.println(w1.company);
		System.out.println(w1.dept);
		System.out.println(w1.personInfo.name);
		System.out.println(w1.personInfo.age);
	}
}
