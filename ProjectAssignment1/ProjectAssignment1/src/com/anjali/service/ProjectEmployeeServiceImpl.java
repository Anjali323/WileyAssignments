package com.anjali.service;

import java.util.HashSet;

import com.anjali.bean.Employee;
import com.anjali.bean.Project;
import com.anjali.persistence.IProjectEmployee;
import com.anjali.persistence.ProjectEmployeesDaoImpl;

public class ProjectEmployeeServiceImpl implements IProjectEmployeeService {
	IProjectEmployee pedao = new ProjectEmployeesDaoImpl();

	@Override
	public boolean allocate(Employee emp, Project pro) {
		return pedao.allocate(emp, pro);
	}

	@Override
	public boolean dellocate(Employee emp, Project pro) {
		return pedao.dellocate(emp, pro);
	}

	@Override
	public HashSet<Employee> getEmployeesByProjectID(Project pro) {
		return pedao.getEmployeesByProjectID(pro);
	}

}
