package com.databaseConnector.springProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.databaseConnector.springProject.entity.Employee;
import com.databaseConnector.springProject.service.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee") //http://localhost:1999/addEmployee
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);
	}
	
	@PostMapping("/addEmployees") //http://localhost:1999/addEmployees
	public List<Employee> addEmployees(@RequestBody List<Employee> employees)
	{
		return service.saveEmployees(employees);
	}
	
	@GetMapping("/findAllEmployees") //http://localhost:1999/findAllEmployees
	public List<Employee> findAllEmployees()
	{
		return service.getEmployees();
	}
	
	@GetMapping("/displayEmployees") //http://localhost:1999/displayEmployees
	public List<Employee> displayEmployees() //display all employee based on their name in ascending order
	{
		return service.displayEmployees();
	}
	
	@GetMapping("/findEmployeeById/{id}")  //http://localhost:1999/findEmployeeById/102
	public Employee findEmployeeById(@PathVariable int id)
	{
		return service.getEmployeeById(id);
	}
	
	@GetMapping("/updateEmployee/{id}")  //http://localhost:1999/updateEmployee/102
	public Employee updateEmployee(@PathVariable int id)
	{
		return service.updateEmployee(id);
	}	
}