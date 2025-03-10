package study;

//배열 자료형과 기본자료형의 차이점
public class Array_5 {
	public static void main(String[] args) {
		//기본자료형에서의 예제
		int a = 10;
		int b = 20;
		a = b; //우측의값을  좌측에 대입한다.
		b = 30;

		System.out.println("a는"+a+" b는"+b);

		System.out.println();

		int[] arr1 = new int[1];
		arr1[0] = 10;
		int[] arr2 = new int[1];
		arr2[0] = 20;
//		┌────┐
//		│ 10 │
//		└────┘
		System.out.println("");

		arr1 = arr2; //전체를 지정하는
		arr2[0] = 30; //초기화하는
		System.out.println("arr1[0] = "+arr1[0]); //30
		System.out.println("arr2[0] = "+arr2[0]); //30

	}
}
