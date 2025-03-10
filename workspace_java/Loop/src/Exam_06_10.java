/*
* while
* for
* break
* continue
* 무한루프
* 이중반복문*/
public class Exam_06_10 {
	public static void main(String[] args) {
		int i = 0, k = 0;
		for (i=1;i<100;i++){
			k+=i; // k = k+i
			if(k>100)
				break;
			System.out.println("k = "+ k);
			System.out.println("i = "+ i);
		}
		System.out.println(i);
		//??? 왜 14임
	}
}
