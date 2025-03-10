package practice;

public class Practice_10_06 {

	// 호출해보세요.
	public static void main(String[] args) {
		int arr[] = {5,2452,1238,65559,4659};
		System.out.println(arrMax(arr));
	}
	public static int arrMax(int[] arr){
		//정수형 배열을 매개변수로 받아
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
}
