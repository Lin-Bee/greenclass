package com.green.rest.controller;

import com.green.rest.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/members")
@Slf4j
@RestController //객체생성+관제탑 역할 부여
//-> 이 클래스는 모든 요청(url)을 받는 클래스
public class MemberController {

	@GetMapping() // localhost:8080/members
	public void getMemberList(){
		System.out.println("getMemberList() 메서드 실행");
	}
  //인터넷에 members를 하게되면 get만됨 post는 프로젝트만들어야함
	//but 방법이이씀 > CLASS값과 저 친구가이름이 같으면 알아서 들어감
	//회원을 등록(post)하는 기능 localhost:8080/members
	@PostMapping()
	public void insertMember(@RequestBody MemberDTO memberDTO){
		System.out.println("insertMember() 메서드 실행");
		System.out.println(memberDTO.toString());
	}

	//회원한명을 조회하는 기능
	//조회하려는 회원 테이블이 member임 (중복이있어서 rest_member로해둠
	@GetMapping("/{age}") //id는 매번 달라져야해서 {name,age }
	//URL에 {}로 표현되는 내용은 값을 받아올때 사용 < 해당부분역시 조절가능
	public void getMember(@PathVariable("age") int age){
		// PathVariable 이 url의 변수{memId} 이고 받은걸 id에 넣어야함
		System.out.println("getMember() 메서드 실행");
		System.out.println("age = " + age);
	}

	//LOCALHOST:8080/members/IDC/15
	@GetMapping("/{memId}/{memAge}")
	public void getMember2(@PathVariable("memId") String memId, @PathVariable("memAge") int memAge){
		System.out.println("getMember2() 메서드 실행");
		System.out.println("memId = " + memId);
		System.out.println("memAge = " + memAge);
	}

	//회원한명을삭제하는 기능
	@DeleteMapping("/{memId}") //특정 primarykey삭제
	//DELETE FROM REST_MEMBER WHERE MEM_ID = 'IDC';
	public void deleteMember(@PathVariable("memId") String memId){
		log.info("회원삭제");
		log.info("memId =" + memId);
	}

	//회원한명의 이름과 나이를 변경하는 일단 정석으로 gogo
	// UPDATE RESET_MEMBER
	// SET MEM_ID = {id}
	// MEM_NAME='TTT',
	// MEM_AGE = 86;
	@PutMapping("/{memId}")
	public void updateMember(@PathVariable("memId") String memId,
													 @RequestBody MemberDTO memberDTO){
		log.info("회원한명의 정보변경");
		log.info("memId ="+memId);
		log.info("MemberDTO ="+memberDTO);
	}
}
