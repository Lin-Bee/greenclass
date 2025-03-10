package Practice2;

public class Rectangle {
	private int x1;
	private int x2;
	private int y1;
	private int y2;

	public Rectangle(){

	}

	//자동으로 생성해주는 기능이 있음
	//기본생성자 말고 신규 생성하는 방법
	//원하는 위치 우측클릭 > generate > constructor
	public Rectangle(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public void set(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int square(){
		return (getX2()-getX1())*(getY2()-getY1());
	}

	public void show(){
		System.out.println("x1의 좌표는" + getX1());
		System.out.println("x2의 좌표는" + getX2());
		System.out.println("y1의 좌표는" + getY1());
		System.out.println("y2의 좌표는" + getY2());
		System.out.println("넓이는" + square());
	}

	public boolean equals(Rectangle r){
		return square()==r.square();
	}


}
