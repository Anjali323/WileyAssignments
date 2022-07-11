package com.anjali.service;

import java.util.ArrayList;

import com.anjali.bean.Project;
import com.anjali.persistence.IProjectDao;
import com.anjali.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements IProjectService {
	private IProjectDao productDao = new ProjectDaoImpl();
	@Override
	public Project searchRecordById(int empId) {
		return productDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Project> getAllRecords() {
		return productDao.getAllRecords();
	}

}
