public class Chef implements Cookable {
	//결합도가 높은 코드란?
	public void cook(){
		System.out.println("요리사가 요리를 합니다");
	}
}

class SuperChef implements Cookable{
	public void cook(){
		System.out.println("슈퍼 요리사가 요리합니다");
	}
}

interface Cookable{
	//추상매서드만 들어갈수 있음
	public void cook();
}