package practice;

import java.util.Scanner;

public class Practice_08_13to14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자입력");
		int a = sc.nextInt();
		System.out.println("두번째 숫자입력");
		int b = sc.nextInt();

		System.out.println("문제 13번");
		between(a, b);
//		int a = 5;
//		int b = 15;
//		between(a,b) 이런식으로 설정가능함

		System.out.println("");
		System.out.println("문제 14번");
		fivenum(a, b);
	}
	public static void between(int a, int b){
		System.out.println("min max 비교");
		int min =0;
		int max =0;

		if(a>b){
			min = b;
			max = a;
		}else if(a<b){
			min = a;
			max = b;
		}

		for(int i = 1; i<max-min; i++){
			System.out.print(min+i + " ");
		}
	}

	public static void fivenum(int a, int b){
		int max = a>b?a:b;
		int min = a>b?b:a;
		int count = 0;
		for(int i = min+1; i<max-min; i++){
			int c = min+i;
			//사이 숫자를 출력하는 값 min+i
			System.out.println(min+i + " ");
			if(c%5==0){
				count= count+1;
			}
		}
		System.out.println(count+"개의 5의 배수");
		int var = min+1;
		int cc = 0;
		while (var<max){
			if((var)%5==0){
				cc= cc+1;
			}
			(var)++;
		}
		System.out.println("5의배수 "+cc);
	}
}
