package exam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam_07_19 {
	public static void main(String[] args) {
		//정수 10개를 담을 수 있는 배열을 생성하고,
		int[] arr = new int[10];
		// Math.random()함수를 사용하여 1 ~ 100의 정수를 배열 각 요소에 저장하자.
		for(int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*100+1);
			System.out.print(arr[i] + " ");
		}
		//배열 데이터 확인을 위한 출력
		System.out.println(Arrays.toString(arr));

		//배열에 저장된 모든 정수 및 최소값, 최대값을 출력해보라
		int max = arr[0];
		for(int a:arr){
			if(a>max){
				max = a;
			}
		}
		int min = arr[0];
		for(int b:arr){
			if(min>b){
				min = b;
			}
		}
		System.out.println(max);
		System.out.println(min);
		//(Math.random() 메소드는 0 <= x < 1 사이의 실수를 리턴한다.
	}
}
