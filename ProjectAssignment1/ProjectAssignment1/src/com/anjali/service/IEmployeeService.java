package com.anjali.service;

import java.util.ArrayList;

import com.anjali.bean.Employee;

public interface IEmployeeService {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords(); 
}
