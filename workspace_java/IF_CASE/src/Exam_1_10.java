import java.util.Scanner;

public class Exam_1_10 {
	public static void main(String[] args) {
		int a,b,c;
		int min,mid,max;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수:");
		a = sc.nextInt();
		System.out.print("두번째 수:");
		b = sc.nextInt();
		System.out.print("세번째 수:");
		c = sc.nextInt();

		if(a>b&&a>c){
			max = a;
			if(b>c){
				mid = b;
				min = c;
			}else{
				mid = c;
				min = b;
			}
		}else if(b>a&&b>c){
			max = b;
			if(a>c){
				mid = a;
				min = c;
			}else{
				mid = c;
				min = a;
			}
		}else{
			max = c;
			if(a>b){
				mid = a;
				min = b;
			}else{
				mid = b;
				min = a;
			}
		}

		System.out.println(max + ">" + mid + ">" + min);

//	아래처럼 해도 ㄱㅊ
//		if(a>b){
//			if(b>c){
//				System.out.println(a+">"+b+">"+c);
//			}else if(c>b){
//				if(a>c){
//					System.out.println(a+">"+c+">"+b);
//				}else if(c>a){
//					System.out.println(c+">"+a+">"+b);
//				}
//			}
//		}else if(b>a){
//			if(a>c){
//				System.out.println(b+">"+a+">"+c);
//			}else if(c>a){
//				if(b>c){
//					System.out.println(b+">"+c+">"+a);
//				}else if(c>b){
//					System.out.println(c+">"+b+">"+a);
//				}
//			}
//		}

	}
}
