package com.EMA.EMA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EMA.EMA.Entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
