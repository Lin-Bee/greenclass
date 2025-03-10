public class Restaurant {
	private String addr;
	private Cookable chef = new Chef();

	public void takeOrder(){
		chef.cook();
		// 두개의 클래스가 함께 바뀌어야하는 친구가
		// 결합도가 높음 그래서
		// interface를 이용해서 그나마 결합도를 낮추어주는것
	}
}
