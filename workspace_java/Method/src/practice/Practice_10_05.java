package practice;

public class Practice_10_05 {
	public static void main(String[] args) {
//정수형 배열을 매개변수로 받아
		int[] numList = {1,5,89,6,5};
// 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요
		ex05(numList);
	}
	public static void ex05(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
