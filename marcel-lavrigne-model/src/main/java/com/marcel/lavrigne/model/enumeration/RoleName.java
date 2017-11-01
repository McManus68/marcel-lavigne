package com.marcel.lavrigne.model.enumeration;

import org.springframework.security.core.GrantedAuthority;

public enum RoleName implements GrantedAuthority {

	USER, ADMIN, SUPER_ADMIN;

	@Override
	public String getAuthority() {
		return name();
	}

}
