package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	EmployeeService empService;
	
	
	@PostMapping("/createEmployee")
	public String postData(@RequestBody Employee employee) {
		empService.createEmployee(employee);
		return "created";
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}
	
	
	
}
