package com.databaseConnector.springProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.databaseConnector.springProject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	List<Employee> findByOrderByNameAsc();
}
