package study;

//클래스 선언문에서  클래스명 다음에
//'extends 상속할 클래스명' 문법을 적용하면 상속을 사용할수있다.
//상속을 사용하면 상속하는 클래스의 맴버변수, 메서드를 물려받는다.
//물려받는다 : 맴버변수와 메서드를 내것처럼 사용 가능
//	 ┌────────────┐         ┌───────────────┐
//	│     Man     │ ◀─────  │ Business Man │
//	└────────────┘  도식화 └───────────────┘

public class BusinessMan extends Man {
	//Man의 개념을 BusinessMan이 이미 가지고 있게 하기
	//Man의 객체를 내부에서 하나 만들어주다보니 오류가 나는중

	String company;

	//하위 클래서는 상위클래스의 맴버변수, 메서드를 사용하기위해
	//내부적으로 상위클래스의 생성자를 호출해서 객체를 하나 생성
	//상위클래스의 생성자를 호출하는 코드는
//▶ 하위 클래스의 생성자 첫줄에 숨어있음.
	//상위클래스의 생성자는 매개변수 정보가 없는 생성자 호출
	             //기억나니 (매개변수) 안에 적힌 쟤가 매개변수임
	             // ㅇㅇ 기억나얼추
	public BusinessMan(String company){
		super("kim"); //부모클래스의 매개변수 정보가 없는 생성자 호출
		         //따로 작성해주지않아도 호출되고있음
		this.company = company;
	}



	public void tellCompany(){
		System.out.println("My company is " + company);
	}


}
