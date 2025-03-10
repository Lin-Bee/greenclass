package StaticStudy;

//static이 붙은 맴버변수는
//객체에 종속적이지 않고, 모든 객체가 공유하는 데이터
//static 변수는 생성자에서 초기화 하지않는다 > 초기화시 매번 초기화되므로
//static 변수는 초기화 구문이 따로 존재!
//★★★ 생성자보다 static초기화가 먼저 진행이된다 ★★★
//static변수는 객체명, 맴버변수;의 문법으로 호출 권장x
//★★★ static변수는 클래스명.변수명; ★★★
//static은 변수 및 메서드에 적용할수있다
public class CountTest {
	public static void main(String[] args) {
		Count count1 = new Count();
		Count count2 = new Count();
		Count count3 = new Count();

		                                //일반적인 맴버변수처럼썼음
		System.out.println(count1.cnt); // x x x 적절하지 않은 사용법임   ───┐
		count2.cnt = 10; // static으로 쓸경우 함께 박스에 담아서 쓰므로     │
		System.out.println(count1.cnt); //10이됨                           │
		System.out.println(Count.cnt); //o o o ◀──── 클래스명.변수명; ────┘
		                  //클래스명으로 써야함  굿또굿또

		System.out.println(Math.PI);
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20)); //약속 된친구들임

	}
}
