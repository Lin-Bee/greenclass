package com.green.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//anotaion 어노테이션
@RestController
public class TestController {
	@GetMapping("/t1")
	public String Test1(){
		return "java";
	}

	@GetMapping("/t2")
	public int Test2() {
		return 100;
	}

	@GetMapping("/t3")
	public int[] test3(){
		int[] arr = {1,2,3};
		return arr;
	}

	@GetMapping("/t4")
	public Person test4(){
		//person객체생성
		//클래스명 객체명 = new 생성자호출;
		Person p1 = new Person("kim",55,"집시 가구 싶어동");
		return p1;
	}

	@GetMapping("/t5")
	public List<Person> test5(){
		//person클래스에 대한 객체를 다수 저장할 수 있는 list생성
		//ㅣList는 여러개 들어갈 수 있는 통임 <> 이거씀
		List<Person> personList = new ArrayList<>();
		//자료형 변수명 = new 데이터값();
		Person p1 = new Person("길동씨",50,"아버지를아버지라못불러");
		Person p2 = new Person("고양씨",35,"부잣집아가쒸");
		Person p3 = new Person("술",800,"장독대에 살어");

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

		return personList; //자료형이 일치안해서 오류난거라 맞춰줘야함
	}


	@GetMapping("/t6")
	public List<Student> test6(){
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("김이름",60,80,45));
		studentList.add(new Student("박일등",98,100,97));
		studentList.add(new Student("송생숭",40,60,32));
		studentList.add(new Student("이노력",60,84,45));
		studentList.add(new Student("김동동",76,77,78));

		return studentList;
	}
	// react에서 전달하는 데이터를
	// 자바에서 받는 문법은 2가지 존재
	// 1.class활용하기
	// react에서 전달하는 객체의 key와
	// 자바에서 데이터를 받기 위해 매개변수에 선언한 클래스의 변수명이
	//동일하면 데이터를 자동으로 받아옴
	// 2.Collection Framework의 Map을 활용하는 방법
	@PostMapping("/t7")
	public void test7(@RequestBody Person person){
		System.out.println(person);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddr());
	}

	@PostMapping("/t8")
	public void test8(@RequestBody PhoneDTO phones){
		System.out.println(phones.toString());
	}

	@PostMapping("/t9")
	public int test9(@RequestBody Student student){
		System.out.println(student.toString());
		int sumScore = (student.getKorScore()+student.getEngScore()+student.getMathScore());
		System.out.println(sumScore);
		return sumScore;
	}

	@PostMapping("/t10")
	public void test10(@RequestBody Order orderDTO){
		System.out.println(orderDTO.toString());
	}

	//post로 버튼을 클릭한걸인식하면
	// 자바에서 숫자를 출력하고
	// 해당 내용을 되돌려주기
	@GetMapping("/getLotto")
	public int getLotto(){
		int num =(int)(Math.random()*45)+1;
		return num;
	}


	@GetMapping("/boardInfo")
	public List<Board> boardInfo(){
		List<Board> bList = new ArrayList<>();
//		Board b1 = new Board(1,"제목입니다1","김자바",0,"안녕하세요~ 내용입니다1");
//		Board b2 = new Board(2,"제목입니다2","박자바",0,"안녕하세요~ 내용입니다2");
//		Board b3 = new Board(3,"제목입니다3","이자바",0,"안녕하세요~ 내용입니다3");
//		Board b4 = new Board(4,"제목입니다4","김자바",0,"안녕하세요~ 내용입니다4");
//		Board b5 = new Board(5,"제목입니다5","이자바",0,"안녕하세요~ 내용입니다5");

		bList.add(new Board(1,"제목입니다1","김자바",0,"안녕하세요~ 내용입니다1"));
		bList.add(new Board(2,"제목입니다2","박자바",0,"안녕하세요~ 내용입니다2"));
		bList.add(new Board(3,"제목입니다3","이자바",0,"안녕하세요~ 내용입니다3"));
		bList.add(new Board(4,"제목입니다4","김자바",0,"안녕하세요~ 내용입니다4"));
		bList.add(new Board(5,"제목입니다5","이자바",0,"안녕하세요~ 내용입니다5"));

		return bList;
	}

	@GetMapping("/orderInfo")
	public List<OrderInfo> orderInfo(){
		List<OrderInfo> orderList = new ArrayList<>();

		orderList.add(new OrderInfo(101,"데님 청바지",15000,2,"abc"));
		orderList.add(new OrderInfo(102,"맨투맨 반팔 티셔츠",10000,3,"mtmhalf"));
		orderList.add(new OrderInfo(103,"오버핏 니트",25000,2,"overfit"));
		orderList.add(new OrderInfo(104,"롱 패딩",55000,1,"longpadding"));
		orderList.add(new OrderInfo(105,"맨투맨 긴팔 티셔츠",12000,3,"mtmlong"));

		return orderList;
	}

}
