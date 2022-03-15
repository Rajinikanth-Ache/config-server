package com.bhavna.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bhavna.ms.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	@Query(value="select * from employee_springboot t where t.name=:name",nativeQuery = true)
	Employee getByName(String name);
}
