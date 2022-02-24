package com.cg.eis.service;

/*
 * Employee Service Interface is declared here.
 */

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public static HashMap<Integer,Employee> e = new HashMap<>();
	public void addEmployee(Employee emp);
	public void display(String insuranceScheme);
	public void delete(int id);
}