package study;

public class ClsTest {
	//sout 기준으로는 숫자가 변하지않음
	//출력기준이므로 1 4 / 2 5 / 3 6 임
	//super내부의 숫자는 무의미함
	public static void main(String[] args) {
		SubCLS sub1 = new SubCLS();  //1  4
		SubCLS sub2 = new SubCLS(5); //2  5
		SubCLS sub3 = new SubCLS(5, 10);  //3 6
	}
}
