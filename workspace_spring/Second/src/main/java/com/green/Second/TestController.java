package com.green.Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //객체를 생성할거시다
public class TestController {
	//        클래스명 객체명 = new 생성자명(매개변수 or 빈값);
	private MemberService memberService; // = new MemberService();
	//원래라면 위처럼 만들어줘야함 객체생성해줘야하지만
	//spring은 객체생성안하고 자동으로하게 해줘서 new는 안해도됨

	//상단 멤버서비스를 알아서 데리고옴
	@Autowired // < 이 autowired는 TestController안에 선언한 memberService에 생성자를 주입
	public TestController(MemberService memberService){
		//자료형을 불러온 후 이 자료형은 this.이러함에 불러갈것이다 하고 작성
		this.memberService = memberService;
		//실행하기 위해서 우리는 DI (의존성주입 > 중 생성자주입진행)
	}

	@GetMapping("/a")
	public void aaa(){
		System.out.println("aaaa메서드실행");
		//memberService.aaa();
		// 실행안됨 >> 사유 : 멤버서비스는 선언만한거고 아직 안불러옴
		//실행하기 위해서 우리는 DI (의존성주입 > 중 생성자주입진행)
		memberService.aaa();
	}

}
