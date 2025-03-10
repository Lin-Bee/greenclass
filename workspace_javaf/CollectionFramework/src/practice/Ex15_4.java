package practice;

import java.util.ArrayList;
import java.util.List;

public class Ex15_4 {
	public static void main(String[] args) {
		List<Integer> random = new ArrayList<>();
		//(Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴
		//리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
		for (int i = 0; i <10 ; i++) {
			random.add((int)(Math.random()*100+1));
		}
		System.out.println(random);
   /*＿人人人人人人人＿
		＞ 랜덤쓰는법까먹음 ＜
		￣Y^Y^Y￣Y￣Y￣Y￣Y
		　 _n
		　( ｜　 ハ_ハ
		　 ＼＼ ( ‘-^　)
		　　 ＼￣￣　 )
		　　　 ７　　/*/
		// 그 후  저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
		int evenCnt = 0;
		for (int j = 0; j < random.size() ; j++) {
			if(random.get(j)%2==0){
				System.out.print(random.get(j)+" ");
				evenCnt = evenCnt+1;
			}
		}
		System.out.println("짝수의 갯수는"+evenCnt);







	}
}
