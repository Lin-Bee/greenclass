package StaticStudy;

public class Count2 {
	static int cnt;
	int number;

	public void aaa(){
		System.out.println(cnt);
		bbb();
	}

	public static void bbb(){
		//static이 붙은게 먼저 인식되다 보니 number를 인식하지못함
		//System.out.println(number); // 오류발생
		//aaa();                      // 오류발생
	}

	public static void main(String[] args) {
		//aaa();
		bbb();
	}

}
