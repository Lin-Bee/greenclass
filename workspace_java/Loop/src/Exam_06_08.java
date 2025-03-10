import java.util.Scanner;

public class Exam_06_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자하나를 적어봐");
		int i=sc.nextInt();
		int is= i;
		int even=0;
		int even2=0;

		while(i>0){//입력받은 값~0까지
			System.out.println(i);
			if (i%2==0){
				even = even+1;
			}
			i--;
		}
		System.out.println(even + "개");

		for(i=is; i>0; i--){
			if(i%2==0){
				even2=even2+1;
			}
		}
		System.out.println(even2 + "개");
	}
}
