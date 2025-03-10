package OffLimits1;
/*
접근제한자
- 맴버변수, 메서드, 클래스의 사용범위를 지정
  ㄴ 메서드안에 선언된 지역변수 안에는 사용불가능

종류 : public    | 공공의     | 같은 프로젝트내에서 접근가능
       default   | 기본적인   | 같은 패키지 내에서 접근가능 < default는 앞에안붙이면됨
       protected | 보호받는   | 상속 클래스 및 같은 클래스안에서만가능
       private   | 개인적인   | 변수, 메서드를 선언한 Class안에서만 접근가능

			public > default > protected > private

결론 : 일단 맴버변수에는 무조건 private쓰기
       일단 매소드 일단 무조건 public쓰기
*/
public class Orange {
	private int a;
	int b; // 사실상(default) int b; 임
	public int c; //

	private int price;
	//setter
	public void setPrice(int price){
		this.price = price;
	}

	private void aaa(){}
	void bbb(){}
	public void ccc(){}

}
