package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

	public List<MemberDTO> showMemberList();

	public int insertMemberList(MemberDTO memberDTO);

	public MemberDTO showMemberDetail(String memId);

	public int updateMemberInfo(MemberDTO memberDTO);
	public int deleteMemberInfo(String memId);

}
