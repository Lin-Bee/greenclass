import java.util.Scanner;

public class Exam_2_3_2 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 사이의 숫자를 입력해라!");
		num = sc.nextInt();

		int tens = num/10;
		int ones = num%10;

		int clapCnt = 0;//박수의 갯수
		//clapCnt = clapCnt+1;
		//clapCnt += 1;
		//++clapCnt;
		//clapCnt++;

		if(num>0&&num<=99){
			if(tens == 3 || tens == 6 || tens == 9){
				++clapCnt;
			}
			if(ones == 3 || ones == 6 || ones == 9){
				++clapCnt;
			}
		}else{
			System.out.println("숫자 0~99사이를 적어라");
		}
		switch (clapCnt){
			case 0:
				System.out.println("no 박수");
				break;
			case 1:
				System.out.println("박수 짝");
				break;
			case 2:
				System.out.println("박수 짝짝");
				break;
		}

	}
}
