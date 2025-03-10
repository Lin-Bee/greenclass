/*반복문은 (while,for)
		특정코드를 원하는 횟수만큼 반복적으로 실행하는 코드
		while : ~하는 동안

		반복 시작조건;
		while(반복조건){
			반복실행할코드
			반복실행할코드
			반복을 파기할 조건
		}
*/
//변수,자료형,연산자,조건문(if),반복문
public class While_1 {
	public static void main(String[] args) {
		int num = 0; //★★ 반복시작조건 ★★
		while(num<5){ //★★ (반복조건) ★★ 참일동안반복
			System.out.println(2*num); //반복실행코드
			num++; //반복파기조건
						// ★파기조건은 내부이기만 하면 어디든 상관없음
						//결과값이 달라질수 있음
		}
	}
}
