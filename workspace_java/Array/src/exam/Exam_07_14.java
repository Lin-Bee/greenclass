package exam;

public class Exam_07_14 {
	public static void main(String[] args) {
		//	초기값을 5,4,3,2,1로 갖는 배열 arr을 만들자.
		int[] Arr = {5,4,3,2,1};
		//	그리고 길이가 5인 새로운 정수형 배열 newArr을 만든 후
		//int[] newArr = new int[5]; < 가능하면 변수로 쓸것
		int[] newArr = new int[Arr.length];
		//	arr이 가진 값을 newArr로 복사하여 보자.

		//	복사 결과는 출력을 통해 확인한다.

		for(int i =0; i<Arr.length; i++){
			newArr[i] = Arr[i];
			//순서 주의하기 우측을 좌측에 넣는다임
			System.out.print("Arr"+i+" 은"+Arr[i]);
			System.out.println(" ");
		}

		for(int i =0; i<newArr.length; i++){
			System.out.print("newArr"+i+" 은"+newArr[i]);
			System.out.println(" ");
		}

	}
}
