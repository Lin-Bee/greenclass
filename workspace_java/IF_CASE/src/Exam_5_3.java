import java.util.Scanner;

public class Exam_5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		String ao;
		double result = 0;

		System.out.print("첫 번째 수 :");
		x = sc.nextInt();
		System.out.print("두 번째 수 :");
		y = sc.nextInt();
		System.out.print("연산자 : ※[+,/,*,-] 중 선택하여 사용하시오");
		ao = sc.next();

		if(ao.equals("+")||ao.equals("*")||ao.equals("/")||ao.equals("-")) {
			if (ao.equals("+")) {
				//System.out.println(x+ao+y+"="+(x+y));
				result = (x + y);
			} else if (ao.equals("*")) {
				//System.out.println(x+ao+y+"="+(x*y));
				result = (x * y);
			} else if (ao.equals("-")) {
				//System.out.println(x+ao+y+"="+(x-y));
				result = (x - y);
			} else if (ao.equals("/")) {
				//System.out.println(x+ao+y+"="+(x/(double)y));
				result = (x / (double) y);
			}

			// 나누기 연산 결과는 result
			// 나머지 연산 결과는 (int)result
			if(ao.equals("/")){
				System.out.print(x + ao + y + "=" + result);
			}
			else{
				System.out.print(x + ao + y + "=" + (int)result);
			}

			System.out.print(x + ao + y + "=" + (ao.equals("/") ? result : (int)result)   );
			System.out.print(x + ao + y + "=" + (ao.equals("/") ? String.valueOf(result) : String.valueOf((int)result))   );



		}else{
			System.out.println("똑바로써봐 좀");
		}
			//위의 if값은
		//System.out.println(x + ao + y + "=" + x(ao값)y);\
		//중복되는 코드 제거를 위해 중복되는 코드는 밖으로 빼낸다

	}
}
