package com.pe.apps.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pe.apps.dao.EmployeeDao;
import com.pe.apps.dao.EmployeeDaoImpl;
import com.pe.apps.entity.Employee;


@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
	
	@Autowired
	@Qualifier("employeeDao")	
	EmployeeDao employeDaoImpl;


	public List<Employee> getListEmployee() {	
		return employeDaoImpl.getListEmployee();
	}

	public boolean addEmployee(Employee employee) {	
		return  employeDaoImpl.addEmployee(employee);	
	}

}
