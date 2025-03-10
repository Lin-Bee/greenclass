package exam;

import java.util.Scanner;

public class Exam_07_11 {
	public static void main(String[] args) {
		// 국어, 영어, 수학점수를 입력받아 각 과목에
		//대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자. 반드시 배열을 사용
		Scanner sc = new Scanner(System.in);

		System.out.println("국어성적을 입력하시오");
		int ko = sc.nextInt();
		System.out.println("영어성적을 입력하시오");
		int en = sc.nextInt();
		System.out.println("수학성적을 입력하시오");
		int math = sc.nextInt();
		int sum = ko+en+math;
		double aver = sum/3.0;

		double[] grade = {ko,en,math,sum,aver};

		for(int i = 0; i<grade.length; i++){
			if(i<3){
				System.out.println("점수는" + grade[i]);
			}else if(i==3){
				System.out.println("합계는" + grade[i]);
			}else{
				System.out.println("평균은" + grade[i]);
			}
		}
	}
}
