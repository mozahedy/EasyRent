package com.easyRent.service;

import java.util.List;

import com.easyRent.domain.Property;
 
public interface PropertyService {

	public void save(Property property);
	public List<Property> findAll();
	//public Property findByEmployeeNumber(Long employeeId);
}
