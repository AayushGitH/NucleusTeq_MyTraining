package com.project.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entities.Employee;
import com.project.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;

	// Create
	@Override
	public Employee createEmp(Employee emp) 
	{
		return this.employeeRepository.save(emp);
	}

	// Read
	@Override
	public List<Employee> readEmployees() 
	{
		return this.employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> readSEmployee(int id) 
	{
		return this.employeeRepository.findById(id);
	}

	// Update
	@Override
	public Employee updateEmployee(Employee emp) 
	{
		return this.employeeRepository.save(emp);
	}

	// Delete
	@Override
	public void deleteEmployee(int id) 
	{
		this.employeeRepository.deleteById(id);
	}

}
