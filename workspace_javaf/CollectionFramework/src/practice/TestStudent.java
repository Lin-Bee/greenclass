package practice;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		//스튜던트클래스의 객체가 다수저장될 수 있는 리스트 생성
		List<Student> studentList = new ArrayList<>();
		//리스트에 3개의 학생개체 생성
											//"이름",국어점수,영어점수
		Student s1 = new Student("김이름",12,5);
		studentList.add(s1);
		//위아래는 동일하다 오른쪽게 실제 왼쪽은 저장하는 통이므로
		//그냥 s2와 s3가 없을뿐
		studentList.add(new Student("이이름",40,50));
		studentList.add(new Student("김천재",95,100));


		for (int i = 0; i <studentList.size() ; i++) {
			System.out.println(studentList.get(i));
		}

		System.out.println("");

		System.out.println("총점이 150점 이상인 학생의 모든 정보를 출력하세요.");
		for (Student s:studentList){
			if(s.getSum()>=150){
				System.out.println(s);
			}
		}

		System.out.println("");

		System.out.println("모든 학생에 대한 평균 점수를 출력하세요.");
		int sum = 0;
		for (Student s:studentList){
			sum += s.getSum();
			System.out.println("이름 : " + s.getName() + " | 평균 :" + (double)(s.getSum()/2));
		}
		double avg = (double)(sum/studentList.size());
		System.out.println("학생들의 평균 : "+avg);

		System.out.println("");

		/*System.out.println("총점이 1등인 학생의 모든 정보를 출력해보세요");
		Student noOne = studentList.get(0);
		for (int i = 0; i <studentList.size() ; i++) {
			if (noOne.getSum() < studentList.get(i).getSum()){
				noOne = studentList.get(i);
			}
		}
		System.out.println("1등은"+noOne.toString());*/

		int maxIndex = 0;
		for (int i = 0; i <studentList.size() ; i++) {
			if (studentList.get(i).getSum() > studentList.get(maxIndex).getSum()){
				maxIndex=i;
			}
		}
		System.out.println("1등은"+studentList.get(maxIndex));

	}
}
