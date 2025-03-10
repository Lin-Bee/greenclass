package practice;

import java.util.ArrayList;
import java.util.List;

public class Ex15_3 {
	public static void main(String[] args) {
		// 이름을 저장하는 리스트를 만들고 리스트에 적당히 데이터를 저장한다.
		List<String> name = new ArrayList<>();

		name.add("깐따삐야");
		name.add("홍길동");
		name.add("송길동");
		name.add("둘리");
		name.add("아가");
		name.add("또치");
		// 그 후 저장된 이름 중 ‘홍길동’이라는 이름이 있다면
		for (int i = 0; i < name.size() ; i++) {
			if(name.get(i).equals("홍길동")){
				// ‘해당 이름이 존재합니다.’라는 문구를 출력
				System.out.println("해당이름이 존재합니다.");
			}
		}


	}
}
