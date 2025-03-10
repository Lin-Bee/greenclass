package com.green.member_manager.controller;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
//1.restcontroller 관제탑이다 설정
//2. member부터 시작할거라는 기본 mapping설정
//3. 서비스의 것을 constructur생성 후 autowirted
//4. 리턴타입을 맞추어 get @ post put 으로 불러오기
public class MemberController {
	private MemberService memberService;

	@Autowired //컨스트럭쳐
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("")
	public List<MemberDTO> showMemberList(){
		return memberService.showMemberList();
	}
	@PostMapping("") //포스트이니깐 바디
	public int insertMemberList(@RequestBody MemberDTO memberDTO){
		return memberService.insertMemberList(memberDTO);
	}
	@GetMapping("/{memId}")
	public MemberDTO showMemberDetail(@PathVariable ("memId")String memId){
		return memberService.showMemberDetail(memId);
	}
	@PutMapping("/{memId}") // 아이디를 기준으로 dto를 변경할거니깐
	public int updateMemberInfo(@PathVariable ("memId")String memId,
															@RequestBody MemberDTO memberDTO){
		memberDTO.setMemId(memId); //memberdto의 아이디에 memid를 넣어주겠다고 선언해주기
		return memberService.updateMemberInfo(memberDTO);
	}
	@DeleteMapping("/{memId}")
	public int deleteMemberInfo(@PathVariable("memId") String memId){
		return memberService.deleteMemberInfo(memId);
	}



}
