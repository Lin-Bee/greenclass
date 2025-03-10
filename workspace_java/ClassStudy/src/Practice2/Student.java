package Practice2;

public class Student {
	// 학생등록, 학생정보변경, 학생정보출력의 기능 < 매서드 3개
	//학생 클래스는 이름, 나이, 학점(“A”,“B”,“C”..), 연락처 정보 < 클래스 1
	//학생관리 클래스는 학생등록, 학생정보변경(연락처), 학생정보출력, 모든학생정보출력의 기능 <클래스2
	private String name;
	private int age;
	private String cellNum;
	private String grade;

	public Student(String name, int age, String cellNum, String grade) {
		this.name = name;
		this.age = age;
		this.cellNum = cellNum;
		this.grade = grade;
	}

	public String getName() {return name;	}
	public void setName(String name) {this.name = name;	}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public String getCellNum() {return cellNum;	}
	public void setCellNum(String cellNum) {this.cellNum = cellNum;}

	public String getGrade() {return grade;	}
	public void setGrade(String grade) {this.grade = grade;	}

	public void printStuInfo(){
		System.out.println("♥ 이름:"+name+", 나이:"+age+", 학점:"+grade+", 연락처:"+cellNum);
	}

}
