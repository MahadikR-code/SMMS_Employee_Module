package com.tns.cg.smms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.cg.smms.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// This will be AUTO IMPLEMENTED by Spring into a Bean
}
