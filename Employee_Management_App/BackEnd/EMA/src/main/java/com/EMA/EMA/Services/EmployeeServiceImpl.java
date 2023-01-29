package com.EMA.EMA.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EMA.EMA.Entity.Employee;
import com.EMA.EMA.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
	}
	
	@Override
	public List<Employee> getEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(int eId) {
		return employeeDao.getReferenceById(eId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(int eId) {
		Employee e = employeeDao.getReferenceById(eId);
		employeeDao.delete(e);
	}

}
