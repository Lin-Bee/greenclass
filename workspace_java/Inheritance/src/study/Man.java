package study;

import java.lang.annotation.Inherited;

public class Man {
	String name;

	//생성자 제작
	public Man(String name){
		this.name = name;
	}
	//생성자가 하나도 없을때
	// 매개변수가 없는 기본 생성자가 자동으로 만들어짐
//	public Man(){
//	}

	public void tellName() {
		System.out.println("name is " + name);
	}
}
