package practice;

public class Student {
	//학생이름, 국어점수, 영어점수, 총점
	private String name;
	private int koGrade;
	private int engGrade;
	private int sum;


	public Student(){}
	public Student(String name, int koGrade, int engGrade) {
		this.name = name;
		this.koGrade = koGrade;
		this.engGrade = engGrade;
	}

	public String getName() {return name;	}
	public void setName(String name) {this.name = name;	}

	public int getKoGrade() {	return koGrade;	}
	public void setKoGrade(int koGrade) {	this.koGrade = koGrade;	}

	public int getEngGrade() {	return engGrade;	}
	public void setEngGrade(int engGrade) {	this.engGrade = engGrade;	}

	public int getSum() {return getKoGrade() + getEngGrade();}
	public void setSum(int sum) {	this.sum = sum;	}

	@Override
	public String toString() {
		return "Student{" +
						"name='" + name + '\'' +
						", koGrade=" + koGrade +
						", engGrade=" + engGrade +
						", Sum=" + getSum() +
						'}';
	}
}
