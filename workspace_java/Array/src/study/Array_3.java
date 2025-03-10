package study;
//배열 선언, 생성,  >>> '배열 값 저장, 배열값 읽기'
public class Array_3 {
	public static void main(String[] args) {
		//정수를 3개 저장할 수 있는 배열 arr1을 생성
		int[] arr1 = new int[3]; //0 0 0
		//배열 출력은 변수명으로 할 수 없음
		System.out.println(arr1);
		//배열 생성을 통한 공간 하나하나를 '배열의 요소'라고 부른다.
		//0부터시작하는
		System.out.println(arr1[0]);
		//System.out.println(arr1[3]); 주의!!!!!

		//배열의 각 요소에 값 저장
		//arr1의 첫번재 요소에ㅐ 3을 저장
		arr1[1] = 3;
		//  ┌───┬───┬───┐
		//  │ 0 │ 3 │ 0 │
		// └───┴───┴───┘
		System.out.println(arr1[1]);

		//자 이제 전체를 출력하러 가봅시다  - ̗̀ෆ⎛˶'ᵕ'˶ ⎞ෆ ̖́-
		for(int i=0; i<3; i++){
			System.out.print(arr1[i]);
		}
		System.out.println("");
		// 위의 아이는 너무길어 (」ﾟﾛﾟ)｣NOOOooooo━
		//배열의 모든 요소를 출력할 때 사용할 수 있는 조은 명령어
		int[] arr2 = new int[5];

		for(int i=0; i<(arr2.length); i++){
			System.out.println(arr2[i]);
		}

		//배열의 길이를 알수 있는 명령어
		System.out.println(arr2.length);
	}
}
