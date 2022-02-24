package com.cg.eis.service;

/*
 * This package will contain code for services offered in Employee Insurance System. 
 * The service class will have one EmployeeService Interface and its corresponding 
 * implementation class.
 */

import java.util.Map;
import com.cg.eis.bean.Employee;

public class EmployeeInsuranceSystem implements EmployeeService{
	@Override
	public void addEmployee(Employee emp) {
		e.put(emp.getId(), emp);	
	}
	@Override
	public void display(String insuranceScheme) {
		for(Map.Entry<Integer,Employee> entry : e.entrySet()) {
			if(entry.getValue().getInsuranceScheme().equals(insuranceScheme)) {
				System.out.println(entry.getValue());
			}
		}
	}
	@Override
	public void delete(int id) {
		e.remove(id);
	}
}