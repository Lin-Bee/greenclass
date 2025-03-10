package Practice2;

public class Oper {
	private int a;
	private int b;
	private String oper;

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
	public String getOper() {
		return oper;
	}

	public void getOper(String oper) {
		this.oper = oper;
	}

	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int calculate(){
		if(oper.equals("+")){
			int Add = a+b;
			return Add;
		}	else if (oper.equals("-")){
			int Sub = a-b;
			return Sub;
		}else if (oper.equals("*")){
			int Mul = a*b;
			return Mul;
		}else if (oper.equals("/")){
			int Div = a/b;
			return Div;
		}else{
			return a;
		}
	}


}
