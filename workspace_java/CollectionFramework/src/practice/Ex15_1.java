package practice;

import java.util.ArrayList;
import java.util.List;

public class Ex15_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("고기");
		list.add("먹어");
		list.add("해피");
		System.out.println(list);

		for (int i = 0; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
}
