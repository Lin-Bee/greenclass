package exam;

import java.util.Scanner;

public class Exam_07_09 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		Scanner sc = new Scanner(System.in);
		//두가지 방법이 있다
		//요약하면
		for(int i=0; i<arr1.length; i++){
			System.out.println(i+"번째");
			arr1[i] = sc.nextInt();
		}
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+",");
		}

		// 아래방법처럼 처음부터 선언값이 들어가게 작성하는거
		// 값을 받은 친구들 강제저장하기
		//int arr1[] = {a0,a1,a2,a3,a4};
		
	}
}
