package com.anjali.service;

import java.util.ArrayList;

import com.anjali.bean.Project;

public interface IProjectService {
	Project searchRecordById(int empId);

	ArrayList<Project> getAllRecords();
}
