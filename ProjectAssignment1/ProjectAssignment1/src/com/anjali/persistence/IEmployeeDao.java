package com.anjali.persistence;

import java.util.ArrayList;

import com.anjali.bean.Employee;

public interface IEmployeeDao {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords(); 
}
