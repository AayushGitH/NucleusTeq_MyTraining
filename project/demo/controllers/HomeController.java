package com.project.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entities.Employee;
import com.project.demo.services.EmployeeService;
import com.project.demo.services.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class HomeController 
{
	
	@Autowired
	private EmployeeService empService;
	
	//	Create
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(this.empService.createEmp(emp));
	}
	
	// Read
	@GetMapping("/read")
	public ResponseEntity<List<Employee>> readAllEmployee()
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.empService.readEmployees());
	}
	
	@GetMapping("/read/{id}")
	public ResponseEntity<Optional<Employee>> readEmployeeById(@PathVariable int id)
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.empService.readSEmployee(id));
	}
	
	// Update 
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp)
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.empService.updateEmployee(emp));
	}
	
	// Delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable int id)
	{
		this.empService.deleteEmployee(id);
		return ResponseEntity.ok(null);
	}
	
}
