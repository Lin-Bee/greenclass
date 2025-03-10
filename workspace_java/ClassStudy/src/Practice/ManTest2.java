package Practice;

public class ManTest2 {
	public static void main(String[] args) {
		Man2 m1 = new Man2();
		m1.initMember("김이름",30,"울산시");

		Man2 m2 = new Man2();
		m2.initMember("홍이름",20,"서울시");

		//m1과 m2중 나이가 많은 사람이 이름을 출력하세요
		if(m1.getAge()>m2.getAge()){
			System.out.println(m1.getName());
			//get으로 불러오는것도 되고
		}else if(m1.age<m2.age){
			System.out.println(m2.name);
			//걍 이따구로 불러오는것도 되기는 하는데
			//이방법말고 기왕이면 get으로 선언한걸 불러오는걸 추천함
			//getter를 사용했으므로
		}else{
			System.out.println("동갑임");
		}

		if(m1.getAge()==30){m1.setName("이순신");}
		System.out.println(m1.getName());
	}
}
