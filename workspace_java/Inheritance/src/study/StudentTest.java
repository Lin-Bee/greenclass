package study;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(202502,"김자바");
		Student s2 = new Student(202502,"박자바");

		//s1객체와 s2 객체가 같은객체니?
		s1.equals(s2); //false
	//	System.out.println(s1.equals(s2));

	// ++++++++++++++++++++++++++++++++++++++++++++
	//String은 두종류로 표현가능함 자주써서 자바에서 허용
	//String 데이터는 메모리 공간낭비를 최소화 할 수 있도록 조정
		String str1 = new String("말고기");
		String str2 = new String("말고기");
		String str3 = "소고기";
		String str4 = "소고기";

		// == 두 객체의 주소가 같은지 비교하는 연산임
		//숫자비교 연산에서사용
		if(str1 == str2){
			System.out.println("str1과 str2는 같습니다");
		}
		if(str3 == str4){
			System.out.println("str3과 str4는 같습니다");
		}
	}
}
