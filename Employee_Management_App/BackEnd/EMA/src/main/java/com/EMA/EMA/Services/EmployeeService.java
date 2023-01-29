package com.EMA.EMA.Services;

import java.util.List;
import com.EMA.EMA.Entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();
	public Employee getEmployee(int eId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(int eId);
}
