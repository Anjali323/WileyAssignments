package com.anjali.persistence;

import java.util.ArrayList;

import com.anjali.bean.Project;

public interface IProjectDao {
	Project searchRecordById(int empId);

	ArrayList<Project> getAllRecords();
}
