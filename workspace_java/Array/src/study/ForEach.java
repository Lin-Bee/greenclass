package study;
//배열의 각 요소의 값을 읽을 때는 for-each문을 사용할수있다.
public class ForEach {
	public static void main(String[] args) {

		int[] arr1 = {1,5,10};

		//for(반복될 데이터를 하나씩 저장할변수 :반복시킬데이터_ex)여러개)
		//정수는 한번이라 반복안됨
		for(int e:arr1){ // e = 5
			System.out.println(e+""); //1 5 10
		}
		System.out.println();

		String[] arr2 = {"집에","가고","싶다"};
		for(String w:arr2){
			System.out.print(w+"");
		}
	}
}
