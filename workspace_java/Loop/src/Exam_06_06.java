public class Exam_06_06 {
	public static void main(String[] args) {
		int num = 0;
		int box = 0;
		while(num<101){
			if(num==0){

			}else if(num%3==0){
				//System.out.println(num);
				box = box+1;
			}
			num++;
		}
		System.out.println(box);
		System.out.println("");
		int num2;
		int box2 = 0;
		for (num2=1; num2<101; num2++){
			if(num2%3==0){
				System.out.println("3의배수" + num2);
				box2=box2+1;
				System.out.println(box2 + "개");
			}
		}
	}
}
