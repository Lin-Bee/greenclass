package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
	public static void main(String[] args) {
		//정수를 다수 저장 할 수 있는 list객체 생성
		//배열과 다르게 저장할 데이터의 갯수 제한x
		//넣으면 알아서 늘어나요
		List<Integer> list1 = new ArrayList<>();

		//list1에 데이터 추가
		list1.add(5);
		list1.add(3);
		list1.add(10);
		list1.add(5);
		System.out.println(list1); //[5, 3, 5]
		//넣는 순서대로 0부터 index가 설정됨

		//list1에 저장된 데이터 읽기
		list1.get(1); // 몇번째 애를 읽을까?
		System.out.println(list1.get(0)); //5

		//list1에 저장된 데이터 삭제
		list1.remove(1); //첫번째 데이터를 지워주세욤
		System.out.println(list1); //[5,10,5]
		System.out.println(list1.size()); //3 : 3개있다

		//list1에 저장된 데이터수정
		list1.set(0,8); // 몇번째애를 몇으로 변경할것이니?
		//쓸일이없네용
		System.out.println(list1);


		//list1에 저장된 모든 데이터 출력
		for (int i = 0; i < list1.size() ; i++) {
			System.out.println(list1.get(i));
		}

		//list1에 저장된 데이터 완전 날리기
		list1.clear();
		System.out.println(list1);//[]

	}
}
