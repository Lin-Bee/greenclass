package study;

public class PersonManager {
	public static void main(String[] args) {
		//대학동창을 5명 저장할 수 있는 배열 생성
		UnivFriend[] ufs = new UnivFriend[5];
		//직장동료 5명 저장할 수 있는 배열 생성
		CompFriend[] cfs = new CompFriend[5];
		//대학동창이 저장될 배열의 인덱스 넘버
		int ucnt = 0;
		//직장동료저장될 배열의 인덱스
		int ccnt = 0;

		//1-1.대학동창 생성
		//UnivFriend ufs1 = new UnivFriend("김자바","010-2345-6584","생물학과");
		//1.2생성한대학 동창 객체를ufs에 저장
		//ufs[ucnt] = ufs1;
		//2. 대학동창 생성+생성동창 ufs에 넣기 >> //증감연산자는 다른거하고 증가시킨다
		ufs[ucnt++] = new UnivFriend("김자바","010-2345-6584","생물학과");
		ufs[ucnt++] = new UnivFriend("박자바","010-7898-0000","고기학과");

		cfs[ccnt++] = new CompFriend("송직원","010-4589-1234","영업부");
		cfs[ccnt++] = new CompFriend("박과장","010-8599-1234","개발부");

		for (int i = 0; i < ucnt; i++) {
			ufs[i].showInfo();
		}
		for (int i = 0; i < ccnt; i++) {
			cfs[i].showInfo();
		}
	}
}
