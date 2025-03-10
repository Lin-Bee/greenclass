package study;

class SubCLS extends SuperCLS {
	public SubCLS(){
		System.out.println(4);
	}
	public SubCLS(int a){
		super(1);
		System.out.println(5);
	}
	public SubCLS(int a, int b){
		super(1, 2);
		System.out.println(6);
	}
}
