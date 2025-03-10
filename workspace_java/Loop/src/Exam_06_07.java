public class Exam_06_07 {
	public static void main(String[] args) {
		int i=1;
		int num =0;
		while(i<101){//1~100까지
			if(i%5==0){//5로나누면 0이다
				System.out.println(i); //i를 증가
				num = num+1;
			}
			i++;//i가 101기전까지
		}
		System.out.println(num + "개");

		System.out.println("");
		int num2;
		int box2 = 0;
		for (num2=1; num2<101; num2++){
			if(num2%5==0){
				System.out.println("5의배수" + num2);
				box2 = box2+1;
				System.out.println(box2 +"개");

			}
		}
	}
}
