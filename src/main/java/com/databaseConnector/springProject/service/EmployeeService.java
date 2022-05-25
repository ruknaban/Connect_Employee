package com.databaseConnector.springProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.databaseConnector.springProject.entity.Employee;
import com.databaseConnector.springProject.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee)
	{
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employees)
	{
		return repository.saveAll(employees);
	}
	
	public List<Employee> getEmployees()
	{
		return repository.findAll();
	}
	
	public List<Employee> displayEmployees()
	{
		return repository.findByOrderByNameAsc();
	}
	
	public Employee getEmployeeById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public String updateEmployee(Employee employee) {
		Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setName(employee.getName());
		existingEmployee.setDesignation(employee.getDesignation());
		repository.save(existingEmployee);
		return "Record updated successfully";
	}
}
