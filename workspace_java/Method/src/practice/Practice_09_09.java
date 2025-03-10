package practice;

public class Practice_09_09 {
	public static void main(String[] args) {
		int a = 7;
		System.out.println(ex09(a));
	}
	//한 정수를 매개변수로 받아,
	// 1부터 매개변수로 받은 수까지 중
	// //홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요
	public static int ex09(int odd){
		int oddSum=0;
		for(int i=0; i<odd; i++){
			int a = i+1;
			if(a%2==1){
				oddSum=oddSum+a;
				System.out.println(oddSum);
			}
		}
		return oddSum;
	}
}
