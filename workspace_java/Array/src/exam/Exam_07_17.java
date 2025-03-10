package exam;

public class Exam_07_17 {
	public static void main(String[] args) {
		int[] lotto = new int[6];

		//1~45까지의 랜덤한 정수
		double rNum = (int)(Math.random()*45+1);

		//배열의 요소 출력
		for(int i= 0; i< lotto.length; i++){
			lotto[i] = (int)(Math.random()*45+1);
		}
		//배열의 출력
		for(int i= 0; i< lotto.length; i++){
			System.out.print(lotto[i] + " ");
		}
	}
}
