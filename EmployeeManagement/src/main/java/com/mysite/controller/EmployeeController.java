package com.mysite.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysite.model.Employee;
import com.mysite.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@RequestMapping("/")
	String hello() {
		return "ss";
	}
	
	@GetMapping("/employees")
	List<Employee> getAll(){
		return repository.findAll();
	}
	
	@PostMapping("/employees/{employee_id}")
	Employee addEmployee(@RequestBody Employee emp) {
		return repository.save(emp);
	}
	
	@GetMapping("/employees/{employee_id}")
	String getBonus(@PathVariable Integer employee_id) {
		return repository.findById(employee_id).orElse(null).toString();
	}
	
	@DeleteMapping("/employees/{employee_id}")
	void DeleteStudent(@PathVariable Integer employee_id) {
		repository.deleteById(employee_id);
	}
	

}