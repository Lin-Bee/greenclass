package practice;

public class Practice_10_07 {
	public static void main(String[] args) {
		String[] talk ={"고","기","먹","자","앙","★"};

		ex7(talk);
		System.out.println(ex7(talk));
//		호출해보세요.
	}
	public static String ex7(String[] arr){

		String str="";
		for(int i=0; i<arr.length; i++){
			//문자열 배열을 매개변수로 받아
			str = str+arr[i];
			//배열에 저장된 모든 문자열을 나열하여
			System.out.print(str+", ");
		}
		//리턴하는 메소드를 만들고
		return str;
	}

}
