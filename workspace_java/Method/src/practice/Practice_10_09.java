package practice;

import java.util.Arrays;

public class Practice_10_09 {
	public static void main(String[] args) {
		//정수형 배열 하나를 매개변수로 받아
		int[] a = {1,5,8,9,568,878,56,24};
		int[] result = ex9(a);
		System.out.println(Arrays.toString(result));
		//
	}
	//배열의 요소 중 홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.
	public static int[] ex9(int[] arr){
		//매개변수로 전달된 배열에서 짝수만 갖는 새로운 배열 생성
		//1.배열생성 - 처음엔 이렇게 했음 int[] even = {};
		// 1.5 int[] even = new int[?];의 ? 부분 매개변수로 전달된 배ㅕㅇㄹ의 요소에서 짝수의 갯수를 파악
		int arrEvenLength = 0;
		for(int i=0; i<arr.length; i++){
			int num = arr[i];
			if(num%2==0){
				arrEvenLength++;
			}
		}
		int[] even = new int[arrEvenLength];
		//2.매개변수로 전달된 요소중 짝수만 even에 저장
		//정수를 저장하는 index는 even의 index를 파악하기 위한 변수임
		int index = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				even[index] = arr[i];
				index++;

				//둘중의하나만 가능
				//1. even[index++] = arr[i];
				//2./ even[++index] = arr[i]; < 얜 안됨

			}
		}
		return even;
	}
}
