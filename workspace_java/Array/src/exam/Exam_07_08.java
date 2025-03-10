package exam;

public class Exam_07_08 {
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 7};
		int num=0;

		for (int i = 0; i < arr1.length; i++) {
			num = num+arr1[i];
		}
		//System.out.println(arr1[0]+arr1[1]+arr1[2]);

		System.out.println(num);
	}
}