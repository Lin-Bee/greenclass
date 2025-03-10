package study;
// 하위클래스에서 상위클래스의 메서드명과
// 매개변수 정보를 동일하게 작성대도 매서드 선언을 허용하는 overriding
// overriding - 상속관계일때 사용가능
// 상위 클래스에서 정의한 매소드를 덮어쓴다
public class MasterChef extends Chef{
	//public void makeCook(){
	//	System.out.println("쉐프가 요리를합니다");
	//} Chef클래스에 있는 해당내용을 불러오고있음

	public void giveOrder(){
		System.out.println("makecook은");
		makeCook(); //마스터를 요리한다
		System.out.println("this.makecook은");
		this.makeCook(); //마스터가 요리한다
		System.out.println("super.makecook은");
		super.makeCook(); //췌프가 요리한다
		System.out.println("후임에게 지시합니다");
	}
	public void makeCook(){ //후임
		System.out.println("마스터가 요리합니다");
	}
}
