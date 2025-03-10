package Practice;

public class Calculus {
	private int num1;
	private int num2;
//	String oper;

	public void setNum1(int num1){
		this.num1 = num1; //상위개념의 num1은 setnum1이야
	}
	public void setNum2(int num2){
		this.num2 = num2; //상위개념의 num1은 setnum2이야
	}
	public int getNum1(){
		return num1;
	}
	public int getNum2(){
		return num2;
	}
//	public void setOper(String oper){
//		this.oper = oper; //상위개념의 oper는 setoper야
//	}

	//덧셈이면 얘가 출력될거야
//	public void setPrint(){
//		String var = num1+oper+num2+"=";
//		if(oper.equals("+")){
//			System.out.println(var+(num1+num2));
//		} else if (oper.equals("-")){
//			System.out.println(var+(num1-num2));
//		} else if (oper.equals("*")) {
//			System.out.println(var+(num1*num2));
//		} else if (oper.equals("/")) {
//			System.out.println(var+(num1/num2));
//		}else {System.out.println("잘못된 연산자임");
//		}
//	}

	//더한 결과를 리턴하는 기능
	public int getSum(){ return num1+num2;}
	public int getSub(){ return num1-num2;}
	public double getDiv(){ return  num1/(double)num2;}
	public int getMulti(){ return num1*num2;}


}

//클래스 클래스가 무엇인지 객체(인스턴스)가 무엇인지
//클래스 : 객체를만들기위한 설계도
// 객체 : 클래스로부터나온 실체
//클래스의 구성요소 : 멤버변수(필드),메서드의 정의, 생성자
//객체생성문법:클래스명 객체명 = new 클래스명();
//클래스에서 만든 변수 및 메서드 사용방법
// - 객체로 써야하므로 객체.변수; 객체,메서드 호출
//this키워드 this.변수