package com.easyRent.service;

import java.util.List;

import com.easyRent.domain.Employee;
 
public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee findByEmployeeNumber(Long employeeId);
}
