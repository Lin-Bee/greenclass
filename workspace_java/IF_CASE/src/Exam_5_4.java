import java.util.Scanner;

public class Exam_5_4 {
	public static void main(String[] args) {
		int num1;
		int num2;
		String ao;

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수:");
		num1=sc.nextInt();
		System.out.print("두번째 수:");
		num2=sc.nextInt();
		System.out.print("연산자:");
		ao=sc.next();

		switch (ao){
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case "-":
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case "*":
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case "/":
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
			default:
				System.out.println("사용할 수 없는 연산자이다");
		}

	}
}
