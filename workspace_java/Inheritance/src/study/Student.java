package study;

public class Student {
	int sutNum;
	String name;

	public Student(int sutNum, String name) {
		this.sutNum = sutNum;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { //Object 는 자료형상관없이다주세요 임
		Student student = (Student)obj; // 너는 학생이다 라고 알려주기
		if(sutNum == student.sutNum){
			return true;
		}
		else{return false;}
	}
}
