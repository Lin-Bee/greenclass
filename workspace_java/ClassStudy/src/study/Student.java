package study;

import java.util.Scanner;

//이 클래스는 학생을 표현할 설계도
public class Student {
	String stName;
	int stAge;
	int stScore;

	//이름을 변경하는 메서드
		public void setStName(String name1){
			stName = name1;
		}

		//나이를 변경하는 메서드
		public void setStAge(int age1){
			stAge = age1;
		}

		//점수를 변경하는 메서드
		public void setStScore(int score1){
			stScore = score1;
		}

		//이름나이 점수를 모두 변경하는 메서드
	public void setInfo(String name1,int age1, int score1){
			stName = name1;
			stAge = age1;
			stScore = score1;
	}

	//학생의 [이름(나이) 점수]을 출력하는 기능
		public void printInfo(){
			System.out.println("이름 : "+stName);
			System.out.println("나이 : "+stAge);
			System.out.println("점수 : "+stScore);
		}
}
