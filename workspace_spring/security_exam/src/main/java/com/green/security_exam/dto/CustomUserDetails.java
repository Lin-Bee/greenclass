package com.green.security_exam.dto;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
public class CustomUserDetails implements UserDetails {

	private final MemberDTO memberDTO;

	@Override                                     //권한
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collection = new ArrayList<>();

		collection.add(new GrantedAuthority() {
			@Override
			public String getAuthority() {
				return memberDTO.getMemRole();
			}
		});

		return collection;
	}

	@Override
	public String getPassword() {
		return memberDTO.getMemPw();
	}

	@Override
	public String getUsername() {
		return memberDTO.getMemName();
	}

	//계정만료안됬니?
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	//계정이 잠기지 않았니?
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	//자격증명만료 여부
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	//계정사용가능상태니?
	@Override
	public boolean isEnabled() {
		return true;
	}
}
