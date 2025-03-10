package Practice2;

public class Calculator {
	private String oper;
	private int a;
	private int b;

	public Calculator(){}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int calculate(){
		if(oper.equals("+")){int Add = a+b; return Add;}
		else if(oper.equals("-")){int Sub = a-b; return Sub;}
		else if(oper.equals("*")){int Mul = a*b; return Mul;}
		else if(oper.equals("/")){int Div = a/b; return Div;}
		else {return 0;}
	}

	public void showOper(){
		System.out.println(a+oper+b+"="+calculate());
	}
}
