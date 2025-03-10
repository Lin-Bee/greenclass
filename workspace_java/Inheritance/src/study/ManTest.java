package study;

public class ManTest {
	public static void main(String[] args) {

		//생성자 호출
		BusinessMan m1 = new BusinessMan("삼성");
		m1.company="그린";
		m1.tellCompany();

		//이름도 불러올 수있어욤
		m1.tellName();

	}
}
