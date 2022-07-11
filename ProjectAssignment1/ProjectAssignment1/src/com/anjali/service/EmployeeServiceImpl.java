package com.anjali.service;

import java.util.ArrayList;

import com.anjali.bean.Employee;
import com.anjali.persistence.EmployeeDaoImpl;
import com.anjali.persistence.IEmployeeDao;

public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao employeeDao = new EmployeeDaoImpl();
	@Override
	public Employee searchRecordById(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return employeeDao.getAllRecords();
	}

}
