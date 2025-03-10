package Practice;

public class Phone {
	String brand;
	String model;
	String color;
	int price;
	String phNumber;

	//제조사를 변경하는 메서드
	public void setBrand(String brand1){
		brand = brand1;
		//brand는 brand1로 치환하겠다는 setBrand라는 이름의 메서드
	}
	//모델명을 변경하는 메서드
	public void setModel(String model1){
		model = model1;
	}
	//색상을 변경하는메서드
	public void setColor(String color1){
		color = color1;
	}
	//금액을 변경하는 메서드
	public void setPrice(int price1){
		price = price1;
	}
	//전화번호를변경하는메서드
	public void setPhNumber(String phNumber1){
		phNumber = phNumber1;

	}
	//전체를 일괄변경하는 메서드
	public void phoneInfo(String brand1,String model1,String color1,int price1, String phNumber1){
		brand = brand1;
		model = model1;
		color = color1;
		price = price1;
		phNumber = phNumber1;

	}

	public void printInfo(){
		System.out.println(brand+"제조사의");
		System.out.println(model+"입니다");
		System.out.println(color+"색이구요");
		System.out.println(price+"원 입니다");
		System.out.println(phNumber+"이 전화번호입니다");
	}

}
