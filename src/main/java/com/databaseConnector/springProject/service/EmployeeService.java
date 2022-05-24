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
	
	public Employee updateEmployee(int id)
	{
		Employee existingEmployee = repository.findById(id).orElse(null);
		existingEmployee.setSalary(existingEmployee.getSalary()+5000);
		return repository.save(existingEmployee);
	}
}
