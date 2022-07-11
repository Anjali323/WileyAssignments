package com.anjali.service;
import java.util.*;
import com.anjali.bean.Employee;
import com.anjali.bean.Project;

public interface IProjectEmployeeService {
	boolean allocate(Employee emp, Project pro);

	boolean dellocate(Employee emp, Project pro);

	HashSet<Employee> getEmployeesByProjectID(Project pro);
}
