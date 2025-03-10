package study;
//class B extends A > s m c
//class C extends B > d만 신규 작성



public class Ex7 {
	class A{
		private int n;
		public int getN(){
			return n;
		}
		public void setN(int i){
			n=i;
		}
	}

	class B extends A{
		public String s;
		public int m;
		private char c;
		public void setC(char ch){c=ch;}
		public int getC(){return c;}
	}

	class C extends B{
		public double d;
	}
}
