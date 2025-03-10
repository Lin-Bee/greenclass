package study;

public class ChefTest {
	public static void main(String[] args) {
		Chef c1 = new Chef();
		MasterChef c2 = new MasterChef();

		c1.makeCook(); //쉐프가 요리를합니다
		c2.makeCook(); //마스터가 요리합니다
		//c2에서 c1의 값을 불러와 쉐프가 요리합니다를 출력하는건 불가능
		c2.giveOrder();
	}
}
