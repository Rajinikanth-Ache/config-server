package com.bhavna.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.ms.entity.Employee;
import com.bhavna.ms.service.EmployeeService;


@RefreshScope
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService serv;
	
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return serv.addEmployee(employee);
	}
	
	@GetMapping("/get/{name}"+"${domainName}")
	public Employee getByName(@PathVariable("name") String name) {
		return serv.getByName(name);
	}
}
