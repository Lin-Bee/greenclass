import java.util.Scanner;

public class Exam_5_2 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("너의 성별은 ? 여 남");
		s=sc.next();

		switch (s){
			case "여":
				System.out.println("여자입니다");
				break;
			case "남":
				System.out.println("남자입니다");
				break;
			default:
				System.out.println("그런성별 없음");
		}
	}
}
