package study;

public class PersonManager2 {
	public static void main(String[] args) {
		//친구 객체가 10개 저장될 수 있는 배열
		Friend[] fs = new Friend[10];
		// > 부모는 자식을 받을 수 있어서 일괄로 받을 수 있는 부모
		//   Friend 를 이용한 객체를 만듬
		int fcnt = 0;
		fs[fcnt++] = new UnivFriend("김코난","010-2345-6584","생물학과");
		fs[fcnt++] = new CompFriend("유명한","010-5555-8945","인사부");
		fs[fcnt++] = new CompFriend("하인성","010-6687-9999","개발부");
		fs[fcnt++] = new UnivFriend("유미란","010-2345-6584","체육학과");
		fs[fcnt++] = new UnivFriend("남도일","010-1234-9856","탐정학과");

		for (int i = 0; i <fcnt ; i++) {
			fs[i].showInfo();
			System.out.println("");
		}

	}
}
