package com.anjali.persistence;

import java.util.HashSet;

import com.anjali.bean.Employee;
import com.anjali.bean.Project;

public interface IProjectEmployee {
boolean allocate(Employee emp,Project pro);

boolean dellocate(Employee emp, Project pro);

HashSet<Employee> getEmployeesByProjectID(Project pro);
}
