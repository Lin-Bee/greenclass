package exam;

public class Exam_07_18 {
	public static void main(String[] args) {
		//1, 5, 3, 8, 2를 초기값으로 갖는 배열을 생성하고
		int[] arr = {1,5,3,8,2};
		//해당 배열에서 최대값을 출력하여라

		int max = 0; // 일단 첫번째가 제일큰놈
		for(int num:arr){ // max 랑  num(arr의 1~5)까지 비교를했을때
			if(max<num){//만약max<num
				max=num; // max가 num이다
			}
		}
		System.out.println(max);


	}
}
