package com.project.demo.services;

import java.util.List;
import java.util.Optional;

import com.project.demo.entities.Employee;

public interface EmployeeService 
{
	// Create
	Employee createEmp(Employee emp);
	
	// Read
	List<Employee> readEmployees();
	Optional<Employee> readSEmployee(int id);
	
	// Update
	Employee updateEmployee(Employee emp);
	
	// Delete
	void deleteEmployee(int id);
}
