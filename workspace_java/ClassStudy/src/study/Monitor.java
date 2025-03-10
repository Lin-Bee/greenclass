package study;

public class Monitor {
	String brand;
	String color;
	double inch;

	//public monitor(){} 가 default로 생성됨 > 호출가능
	public Monitor(){
		brand = "그린컴퍼니";

	}
	public Monitor(String brand){ // 오버로딩이 생성자에도 적용됨
		this.brand = brand;
	}

	public Monitor(String brand, String color){
		this.brand = brand;
		this.color = color;
		inch = 24;
	}

	public void printInfo(){
		System.out.println("브랜드명"+brand);
		System.out.println("색상"+color);
		System.out.println("크기"+inch);
	}



}
