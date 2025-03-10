package StaticStudy;

public class Count {
	static int cnt; // static이 붙기전에는 각각의 개체였으나
	                // static이 붙으면 해당파일속에 포함된 아이들이 공용으로씀

	//만약 static변수를 초기화한다면
	static {
		cnt = 0;
	}
	//만약 static변수를 초기화한다면

	public Count(){
		//cnt = 0; //XXX 생성자에서 초기화 XXX 생성자에서 초기화 시키면 객체생성마다 초기화되므로
		System.out.println("생성자 실행");
		cnt++;
		System.out.println("cnt = "+ cnt);
	}
}
