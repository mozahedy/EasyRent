package com.easyRent.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {
	@Id 
	private long id;
	
	private String name;
	private String description;
	private float price;
	private float area;
	private LocalDate expireDate;
	private int bathCount;
	
	private int
}
	
