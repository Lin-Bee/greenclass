import java.util.Scanner;

public class If_2 {
	public static void main(String[] args) {
		//키보드로 정수를 하나 입력받아
		//해당 정수가 짝수 일때만 '참'

		System.out.print("정수입력:");
		Scanner sc = new Scanner(System.in);
		int box = sc.nextInt();
		//int box;
 		//box = sc.nextInt(); <이렇게 해도됨

		if(box%2 == 0){
			System.out.println("참");
		}else{
			System.out.println("거짓");
		}

	}
}
