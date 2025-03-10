package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_4 {
	public static void main(String[] args) {
		//person 클래스의 객체를 다수 저장할 수 있는 list객체 생성
		List<Person> list = new ArrayList<>();

		Person p1 = new Person("KIM",50,"울산시");
		Person p2 = new Person("JI",90,"부산시");
		Person p3 = new Person("Lee",40,"대구시");
		Person p4 = new Person("Lee",40,"울산시");

		//출력문에 객체명만 작성하면 객체명, toString() 메서드를 호출!
		System.out.println(p1.toString());
		System.out.println(p2);

		//위에서 만든 Person객체를 list에 저장
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		//list에 저장된 모든 person객체의 정보출력
		System.out.println(list);
		System.out.println("");
		for (int i = 0; i <list.size() ; i++) {
			System.out.println(list.get(i));
			//System.out.println(list.get(i).toString()); 위의 구문과 동일
		}
		System.out.println("");
		for (Person l:list){
			System.out.println(l);
		}
		System.out.println("");
		//울산시에 거주하는 모든 회원의 정보 출력
		for (Person l:list){
			if(l.getAddr().equals("울산시")){
				System.out.println(l);
			}
		}
		System.out.println("");
		for (int i = 0; i <list.size() ; i++) {
			if(list.get(i).getAddr().equals("울산시")){
				System.out.println(list.get(i));
			}
		}

	}
}
