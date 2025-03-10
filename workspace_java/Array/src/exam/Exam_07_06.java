package exam;

public class Exam_07_06 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		//int[] arr1 = {3,3,3,3,3,3,3,3,3,3};
		// 위의 친구는
		for(int num = 0; num<arr1.length; num++){
			arr1[num] = 3;
		}


		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}
