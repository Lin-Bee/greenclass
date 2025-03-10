import java.util.Scanner;
import java.util.regex.Matcher;

public class Exam_2_3 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해라!");
		num = sc.nextInt();

		//num값을 문자열로 변환해서
		// 1.문자를 체크해서 369가있으면 변화하기
		//Integer.toString() 문자열에서 369 받기
		//
		// 숫자에서 369 받기 두개중에 하난데
		//이게 뭔지 기억이 안난단말이지

		String clap = Integer.toString(num); // 클랩은 숫자를 글자로 받아옴//숫자로 다시 받아올껀데

		//1의자리
		if(num>0){
			System.out.print("박수");
		}
		//십자리랑
//		if(clap.length == 2){
//			if(Integer.parseInt(clap.charAt[1]) % 3 == 0 ){
//				System.out.print("짝");
//			}
//		}
//		if(Integer.parseInt(clap.charAt[0]) % 3 == 0 ){
//			System.out.print("짝");
//		}







	}
}
