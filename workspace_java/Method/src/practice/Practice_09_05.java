package practice;

public class Practice_09_05 {
	public static void main(String[] args) {
		//임의의 정수를 매개변수로 받아,
		int grade = 80;
		ex5(grade);
		System.out.println(ex5(grade));
	}
	public static String ex5(int a){
		//만약 매개변수로 받은 정수가 90 이상이면 ‘A’,
		// 70 이상이면 ‘B’, 그 외의 수가 들어오면 ‘C’를 리턴하는 메소드
		String b="";
		if (a>=90) {b="A학점";}
		else if (a>=70) {b="B학점";}
		else {b="C학점";}

		return b;
	}
}
