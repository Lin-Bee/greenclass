package exam;

public class Exam_07_10 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int evenCnt=0;

		//foreach문 사용
		for(int e:arr1){
			if(e%2==0){
				evenCnt++;
			}
		}
		System.out.println(evenCnt);


		System.out.println("////////////////////////////////////////");
		//기본 for문 사용
		for(int i=0; i<arr1.length; i++){
			int a = arr1[i];
			if(a%2==0){
				evenCnt++;
			}
		}
		System.out.println(evenCnt);


/*		＿人人人＿
		＞ 공부싫어!! ＜
		￣Y^Y^Y￣
		　 _n
		　( ｜　 ハ_ハ
		　 ＼＼ ( ‘-^　)
		　　 ＼￣￣　 )
		　　　 ７　　/*/

	}
}
