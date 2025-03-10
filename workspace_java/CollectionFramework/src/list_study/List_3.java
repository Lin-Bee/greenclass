package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_3 {
	public static void main(String[] args) {
		//문자열을 다수 저장할 수 있는 list객체 생성

		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("c++");
		list.add("python");

		System.out.println(list);
		for (int i = 0; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
		for(String l:list){ //foreach구문
			System.out.println(l);
		}

		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());

	}
}
