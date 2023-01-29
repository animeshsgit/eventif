package com.EMA.EMA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EMA.EMA.Entity.Employee;
import com.EMA.EMA.Services.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//Get all employee
	@GetMapping("/employee")
	public List<Employee> getEmlpoyee(){
		return this.employeeService.getEmployee();
	}
	
	//Get particular Employee
	@GetMapping("/employee/{eId}")
	public Employee getEmployee(@PathVariable int eId) {
		return this.employeeService.getEmployee((eId));
	}
	
	//Add a new Employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
	
	//Update the employee
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}
	
	//Delete the employee
	@DeleteMapping("/employee/{eId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int eId) {
		try {
		    this.employeeService.deleteEmployee(eId);
		    return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
