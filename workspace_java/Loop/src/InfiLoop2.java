import java.util.Scanner;

public class InfiLoop2 {
	public static void main(String[] args) {
		//무한루프는 언제 사용하는가?
		//언제까지 돌려야할진 모르겠지만 대충 유저에러해결될때까지

		//국어점수(0~100)를 입력받으세요
		Scanner sc = new Scanner(System.in);
		int score;

		//입력받은 점수가 0~100사이라면 반복문을 종료한다
		while(true){
			System.out.print("국어 점수 입력 (0~100) :");
			score=sc.nextInt();

			if(score>0&&score<=100){
				break;
			}
		}
	}
}
