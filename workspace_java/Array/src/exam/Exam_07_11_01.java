package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_07_11_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//scores[0] = 국어; scores[2] = 영어; scores[3] = 수학; scores[4] = 총점;
		int[] scores = new int[6]; //국 영 수  총점
		//국어 영어 수학 과목명
		String[] subjects = {"국어","영어","수학","과학","사회"};
		//아래와 같이 sum을 할것
		//평균

	//점수입력
	//0~100점 사이의 값을 입력받을 때까지 반복(과목수만큼 반복)
	for(int i = 0; i<scores.length-1; i++){
//		sum = scores[i]++;
		while (true){
			System.out.print(subjects[i]+"점수입력:");
			scores[i] = sc.nextInt();

			//0~100사이만 반복
			if(scores[i]>=0&&scores[i]<=100){
				break; //가장 가까운 반복문을 벗어난다
			}
		}
	}
	//총점 및 평균 구하기
	for(int i = 0; i<scores.length-1; i++){
		//		int sum = scores[0]+scores[1]+scores[2];
		scores[scores.length-1] = scores[scores.length-1]+scores[i];
	}
	//System.out.println("총점은"+(scores[scores.length-1]));

	double avg = scores[scores.length-1]/(double)(scores.length-1);
	//System.out.println("평균은"+avg);

	//+++++++++++++++++++결과출력++++++++++++++++++++++++++++++++s
		System.out.println("");
		System.out.println("*****입력하신 정보로 정보점수를 출력합니다*****");

		for(int i = 0; i<scores.length-1; i++){
			System.out.println(subjects[i]+"점수는"+scores[i]);
		}
		System.out.println("총점은"+(scores[scores.length-1]));
		System.out.println("평균은"+avg+"입니다");

	}
}
