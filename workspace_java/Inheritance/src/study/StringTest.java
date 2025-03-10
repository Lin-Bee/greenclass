package study;

public class StringTest {
	public static void main(String[] args) {
		//String 클래스에 정의된 내용확인하는 영역
		//다양한 method 를 확인하고 다음에 한번써봅시당
		String s1 = "simple";
		String s2 = "java";

		//concat : 두개의 문자열을 나열
		String s3=s1.concat(s2);
		System.out.println(s3); //simplejava

		//length():문자열의 길이를 정수로 리턴
		int len = s3.length();

		//valueOf(); : 오버로딩
		//매개변수로 전달된 데이터를 문자열로 바꿔서 리턴
		String result = String.valueOf(1.5);
		System.out.println(result);

		String data = "Hi java";
		//subString() : 일부 문자열을 추출할때
		String r1 = data.substring(4); //공백도 갯수로침
		System.out.println(r1); //java가 나옴

		String r2 = data.substring(1,4); //공백도 갯수로침
		System.out.println(r2); //시작부터 끝이라서 i j로 나옴

		String data2= "a,b,c";
		//Split() : 매개변수로 전달된 문자열을 기준으로 문자열을 조각내고
		//조각낸 데이터 리턴
		System.out.println(data2.split(",")); //스트링배열이라서 바로안댐
		for (int i = 0; i <data2.split(",").length ; i++) {
			System.out.println(data2.split(",")[i]); //스트링배열이라서 바로안댐
		}
		//.replace(a,b) : a를 b로 바꿔줌 날짜할때 자주씀 기억나닝
		String r4 = data2.replace(",","-");
		System.out.println(r4);

	}
}
