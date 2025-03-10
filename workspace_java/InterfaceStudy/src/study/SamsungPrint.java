package study;

//implements 뜻 : 인터페이스를 불러와서 구현할것이다
//아래 문구는 Print를 해석하여 SamsungPrint를 만들것이다
public class SamsungPrint implements Print{

	@Override
	public void print() {
		System.out.println("흑백 따단");
	}

	@Override
	public void colorPrint() {
		System.out.println("컬러 따단");
	}
}
