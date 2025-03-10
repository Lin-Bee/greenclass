public class Exam_1_8 {
	public static void main(String[] args) {
		//결과 값으로는 A B D H 확인 GO
		int a =10;
		if(a==10) System.out.println("A");
		if(a>=10) {
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		if(a>=10){
			System.out.println("D");
		}else if(a==10){
			System.out.println("E");
		}else if(a<11){
			System.out.println("F");
		}else{
			System.out.println("G");
		}
		System.out.println("H");
	}
	//굿 확인 완료 :D
}
