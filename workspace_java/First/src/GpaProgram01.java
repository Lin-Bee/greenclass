import java.util.Scanner;

public class GpaProgram01 {
	//키보드로 국어 영어 수학 점수를 입력받은후
	//입력받은 점수 및 총점 평균 출력하기
	//단 국어, 영어, 수학점수는 정수만 저장된다
	public static void main(String[] args) {
		//키보드 입력을 받기 위한 변수(복사해서 사용!)
		Scanner sc = new Scanner(System.in);

		System.out.println("국어점수를 입력하세요");
		int koGpa = sc.nextInt();

		System.out.println("영어점수를 입력하세요");
		int engGpa = sc.nextInt();

		System.out.println("수학점수를 입력하세요");
		int mathGpa = sc.nextInt();

		int totalScore = koGpa + engGpa + mathGpa;
		double gpaAverage = totalScore/3.0; //avg

		System.out.println("국어점수는" + koGpa);
		System.out.println("영어점수는" + engGpa);
		System.out.println("수학점수는" + mathGpa);
		System.out.println("세 과목의 합은" + totalScore + "입니다");
		System.out.println("세 과목의 평균은" + gpaAverage + "입니다");

		//다른방법도 있음 나는 입력하는 순간 바로 저장되도록했다면
		//아래 혹은 강사님과같이 별도 선언 후 하면됨
		int koScore;
		int engScore;
		int mathScore;
		int scoreTotal;
		double scoreAvg;

		System.out.print("1국어점수입력하시오");
		koScore = sc.nextInt();

		System.out.print("영어어점수입력하시오");
		engScore = sc.nextInt();

		System.out.print("수학점수입력하시오");
		mathScore = sc.nextInt();

		scoreTotal = koScore + engScore + mathScore;

		System.out.println("1국어점수는" + koScore);
		System.out.println("1영어점수는" + engScore);
		System.out.println("1수학점수는" + mathScore);
		System.out.println("1총점은" + scoreTotal);

		//정수끼리의 연산은 무조건 정수로 나옴
		scoreAvg = scoreTotal/3.0;
		System.out.println("1평균은" + scoreAvg);

	}
}
