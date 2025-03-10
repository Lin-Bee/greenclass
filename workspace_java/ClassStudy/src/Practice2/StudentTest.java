package Practice2;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		//while문 실행여부 값을 가지고 있는 변수
		boolean isRunning = true;

		System.out.println("학생관리프로그램을 실행합니다.");
		//무한으로 돌리는 문
		while (isRunning){
			System.out.print("1)학생등록  2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력  5)프로그램 종료 :");
			int option = sc.nextInt();
			switch (option) {
				case 1:
					manager.regStudent();
					break;
				case 2:
					manager.setNumInfo();
					break;
				case 3:
					manager.printStuInfo();
					break;
				case 4:
					manager.printAllStuInfo();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					isRunning = false;
					//상위 while문을 종료하는 방법
					break;
				default:
					System.out.println("숫자 1~5번까지만 사용이가능합니다");
			}
		}

	}
}
