package com.marcel.lavrigne.model;

import com.marcel.lavrigne.model.enumeration.RoleName;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends MarcelLavrigneEntity  {

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

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
}
