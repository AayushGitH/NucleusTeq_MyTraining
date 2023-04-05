package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{

}
