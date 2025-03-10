package Practice2;

import java.util.Scanner;

public class StudentManager {
	private Scanner sc;
	private Student[] students;
	private int index; //students 배열의 요소를 지정

	public StudentManager(){ //초기화시키는 영역 동일이름
		sc=new Scanner(System.in); //studentManager에서 초기화시킴
		students = new Student[3]; //studentManager에서 초기화시킴
		index = 0;//studentManager에서 초기화시킴
	}

	//학생등록기능
	public void regStudent(){
		System.out.println("학생등록을 시작합니다. 학생정보를 입력하세요");
		System.out.print("이름 :");
		String name = sc.next();
		System.out.println("");
		System.out.print("나이 :");
		int age = sc.nextInt();
		System.out.println("");
		System.out.print("연락처 :");
		String cellNum = sc.next();
		System.out.println("");
		System.out.print("학점 :");
		String grade = sc.next();
		System.out.println("");

		//입력받은 정보로 학생을 생성한다.
		Student stu = new Student(name,age,cellNum,grade);

		//생성한 학생을 students배열에 저장한다.
		if(index<3){
			students[index++] = stu; // 작업후 1증가시킨다
		}else{
			System.out.println("학생을 추가등록할수없습니다");
		}

	}

	//학생정보변경기능
	public void setNumInfo(){
		System.out.println("학생의 연락처를 변경합니다");
		System.out.print("변경학생 :");
		String findName = sc.next();
		for (int i = 0; i <index ; i++) {
			if (findName.equals(students[i].getName())){
				System.out.print("연락처 :");
				String findNum = sc.next();
				students[i].setCellNum(findNum);
			}
		}
	}
	//학생정보출력
	public void printStuInfo(){
		System.out.print("정보를 열람할 학생 : ");
		String findName = sc.next();
		System.out.println("요청하신 학생의 정보입니다");
		for (int i = 0; i <index ; i++) {
			if (findName.equals(students[i].getName())){
				students[i].printStuInfo();
			}
		}
	}
	//모든학생정보출력
	public void printAllStuInfo(){
		System.out.println("모든 학생의 정보입니다. 현재 총 학생수는"+index+"입니다");
		for (int i = 0; i < index; i++) {
			students[i].printStuInfo();
		}
	}
}
