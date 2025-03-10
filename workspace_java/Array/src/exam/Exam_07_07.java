package exam;

public class Exam_07_07 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[10];
		//arr[0] = 1;
		//arr[1] = 2;
		//arr[2] = 3;
		for(int num = 0; num<arr.length; num++){
			arr[num] = num+1;
		}

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}
}
