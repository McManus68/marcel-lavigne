package com.marcel.lavrigne.model;

import com.marcel.lavrigne.model.enumeration.RoleName;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends MarcelLavrigneEntity implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue
	private Long id;

	private String login;

	private String password;

	private String firstname;

	private String lastname;

	private String mail;

	private String city;

	@Enumerated(EnumType.STRING)
	private RoleName role;

	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<RoleName> roles = new ArrayList<>();
		roles.add(role);
		return roles;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return login;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return false;
	}

	public boolean isEnabled() {
		return true;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastName) {
		this.lastname = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public RoleName getRole() {
		return role;
	}

	public void setRole(RoleName role) {
		this.role = role;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
