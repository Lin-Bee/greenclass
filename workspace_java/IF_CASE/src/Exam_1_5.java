import java.util.Scanner;

public class Exam_1_5 {
	public static void main(String[] args) {
		int score;
		String grade = "점수없음";
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();

		//if(score>90&&score<=100) System.out.println("학점은 A입니다.");
		//if(score > 80) System.out.println("학점은 B입니다.");
		//if(score < 80 && score >= 0) System.out.println("학점은 C입니다.");
		//if(score>100 || score < 0) System.out.println("불가능한점수입니다");

		//위 출력문을 한번만 쓸것이다
		if(score>90&&score<=100) {
			grade = "A";
		}else if(score<90&&score > 80){
			grade = "B";
		}else if(score<80&&score >= 0){
			grade = "C";
		}else{
			System.out.println("불가능한점수이다");
		}

		System.out.println("학점은" + grade + "입니다");

		}

	}
