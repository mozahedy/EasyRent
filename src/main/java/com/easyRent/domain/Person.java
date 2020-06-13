package com.easyRent.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="Cordinate")
public abstract class Person {
	@Column
	private long id;
	private String firstName;
	private String lastName;
	private String phone;
	
}
