package com.easyRent.service.impl;

import java.util.List;

import com.easyRent.domain.Property;
import com.easyRent.repository.PropertyRepository;
import com.easyRent.service.PropertyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional 
public class PropertyServiceImpl implements PropertyService {

	@Override
	public void save(Property property) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Property> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
// 	@Autowired
//	private EmployeeRepository employeeRepository;
//
//	public void save(Employee employee) {
//		employeeRepository.save(employee);
//	}
//	public List<Employee> findAll() {
//		return (List<Employee>)employeeRepository.findAll();
//	}
//
//	public Employee findByEmployeeNumber(Long employeeId) {
//		return employeeRepository.findByEmployeeNumber(employeeId);
//	}
// 

}
