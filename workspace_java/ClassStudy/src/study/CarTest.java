package study;

//방금만든 Car 클래스의 실행을 위한 클래스
public class CarTest {
	public static void main(String[] args) {
		//Car 클래스를 활용하여 Car객체 생성
		//객체 생성문법
		// 클래스명 객체명 = new 클래스명();
		//여기서 객체명 == 참조변수명||인스턴스(instance)
		//인스턴스 전체를 지칭할때는 객체 > 하나일땐 인스턴스
		//new =>새로운 인스턴스(객체)를 생성해주세요
		//car1이라는 인스턴스를 생성
		Car car1 = new Car(); //Car는 붕어빵 틀


		//car1 인스턴스의 데이터 접근방법
		//객체명. 변수명;
		car1.carName = "아반떼";
		car1.carPrice= 1000;
		car1.carBrand = "현대";
		System.out.println(car1.carName +car1.carBrand);
		System.out.println(car1.carPrice );

		car1.powerOn();
		car1.takeBreak();

	}
}
