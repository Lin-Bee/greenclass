package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;

import java.util.List;

public interface MemberService {
	public List<MemberDTO> showMemberList();
	public int insertMemberList(MemberDTO memberDTO);
	public MemberDTO showMemberDetail(String memId);
	public int updateMemberInfo(MemberDTO memberDTO);
	public int deleteMemberInfo(String memId);
}
