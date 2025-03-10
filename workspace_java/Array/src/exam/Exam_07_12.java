package exam;

import java.util.Scanner;

public class Exam_07_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기가 될 정수를 입력해라");
		int arrLength = sc.nextInt();
		int[] array = new int[arrLength];
		int sum=0;

		for(int i=0; i<array.length; i++){
			array[i] = i+1;
			System.out.println(array[i]);
		}

		for(int i=0; i<array.length; i++){
			sum = sum+array[i];
		}
		for(int num : array){
			sum = sum+num;
			System.out.println(num);
		}
		double avg = (double)sum/array.length;
		System.out.println(avg);

		System.out.println("///////////////");


//		double avg = (double)sum/array.length;
//		System.out.println(avg);

	}
}
