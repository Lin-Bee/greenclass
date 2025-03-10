package study;

public class Array_4 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int a = 5;

		//a = arr1; 자료형 불일치!!!
		a = arr1[1]; //일치

		String[] arr2 = {"java", "house"};
		int[] arr3 ={1,5,7};
		//arr3 = arr2; 자료형 불일치!!!

		//String abc = arr2;
		//Stromg abc=arr2;

		int[] arr4 = {5,10};
		arr4 = arr3; // arr4 = arr3의 값인 {1,5(,7)} 가된다

		//arr4 = sc.nextInt();
		//arr4는 정수배열이므로 안됨


	}
}
