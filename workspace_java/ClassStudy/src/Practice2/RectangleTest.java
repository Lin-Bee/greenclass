package Practice2;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		//xy xy  1,1 ~ 2,3
		r.show();
		System.out.println();
		s.show();
		System.out.println();

		System.out.println("s 사각형의 넓이는");
		System.out.println(s.square());

		r.set(-2,2,-1,4);
		System.out.println("다시 r의좌표");
		r.show();
		System.out.println("r 사각형의 넓이는");
		System.out.println(r.square());

		if(r.equals(s)){
			System.out.println("두 사각형은 같습니다.");
		}else{
			System.out.println("크기가 다른 두 사각형");
		}
	}
}

