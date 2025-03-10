package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//1.@service에서 쓰는걸2.implements해주깅
//3. 자동으로 생성해서 service와 맞춰주기
//4. mapper에서 선언한걸 서비스가 받아쓰는거라서 -mapper선언
//5. return문 받아오기
public class MemberServiceImpl implements MemberService{

	private MemberMapper memberMapper;

	// 런하자마자 객체생성함
	public MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}

	@Override
	public List<MemberDTO> showMemberList() {
		return memberMapper.showMemberList();
	}

	@Override
	public int insertMemberList(MemberDTO memberDTO) {
		return memberMapper.insertMemberList(memberDTO);
	}

	@Override
	public MemberDTO showMemberDetail(String memId) {
		return memberMapper.showMemberDetail(memId);
	}

	@Override
	public int updateMemberInfo(MemberDTO memberDTO) {
		return memberMapper.updateMemberInfo(memberDTO);
	}

	@Override
	public int deleteMemberInfo(String memId) {
		return memberMapper.deleteMemberInfo(memId);
	}


}
