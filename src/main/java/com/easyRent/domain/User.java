package com.easyRent.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends Person{
	
	@Column
	private String userName;
	
	@Column
	private String password;
	
	@Column
	private String email;
	

}
