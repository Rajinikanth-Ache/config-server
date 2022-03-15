package com.bhavna.ms.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.ms.entity.Employee;
import com.bhavna.ms.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	

	
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	
	public Employee getByName(String name) {
		return repo.getByName(name);
	}
	
	
}
