package practice;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<>();

		Member m1 = new Member("kimid","qlalfqjsgh","김양반",12);
		Member m2 = new Member("java","votmdnjem","김자바",45);
		Member m3 = new Member("parkid","password","박혁거세",50);

		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);

		System.out.println(m1.toString());
		System.out.println(m2);
		System.out.println(m3);

		int ageSum = 0;
		for (Member l:memberList) {
			ageSum = ageSum+l.getAge();
		}
		//List에 저장된 모든 회원의 나이의 합을 출력하여라
		System.out.println("저장된 회원의 나이의 합은 = "+ageSum);

		for (int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals("java")){
				memberList.remove(i);
			}
		}

		System.out.println(memberList);
	}
}
