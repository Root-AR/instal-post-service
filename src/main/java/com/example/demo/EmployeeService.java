package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	
	@Autowired
	private List<Employee> empList= new ArrayList<Employee>();
	
	public void createEmployee(Employee employee) {
		empList.add(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return empList;
	}
	
}
