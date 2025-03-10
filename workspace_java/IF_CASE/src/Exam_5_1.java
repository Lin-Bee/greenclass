import java.util.Scanner;

public class Exam_5_1 {
	public static void main(String[] args) {
		String gender;
		String m = "남";
		String w = "여";

		System.out.println("남,여 中 성별을 1자로 작성해주세요");
		Scanner sc = new Scanner(System.in);

		gender=sc.next();

		if (gender.equals(m)){
			System.out.println("남자입니다");
		} else if (gender.equals(w)) {
			System.out.println("여자입니다");
		}else{
			System.out.println("와우스페셜한 성별이네욤");
			System.out.println("그치만 여, 남 中에 선택해주세요");
		}
	}
}
