package com.cg.eis.bean;

/*
 * In this package, create “Employee” class with different attributes such as 
 * id, name, salary, designation, insuranceScheme.
 */

import java.util.Objects;

import com.cg.eis.exception.EmployeeException;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	public Employee() {};
	public Employee(int id, String name, int salary)  throws EmployeeException{
		this.id = id;
		this.name = name;
		this.salary = salary;
		if(salary >= 40000) {
			this.designation = "Manager";
			this.insuranceScheme = "Scheme A";
		}else if(salary >= 20000) {
			this.designation = "Programmer";
			this.insuranceScheme = "Scheme B";
		}else if(salary >= 5000) {
			this.designation = "System Associate";
			this.insuranceScheme = "Scheme C";
		}else if((salary < 5000)&&(salary >= 3000)){
			this.designation = "Clerk";
			this.insuranceScheme = "No Scheme";
		}else {
			throw new EmployeeException("Salary cannot be less than 3000");
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) throws EmployeeException{
		this.salary = salary;
		if(salary >= 40000) {
			this.designation = "Manager";
			this.insuranceScheme = "Scheme A";
		}else if(salary >= 20000) {
			this.designation = "Programmer";
			this.insuranceScheme = "Scheme B";
		}else if(salary >= 5000) {
			this.designation = "System Associate";
			this.insuranceScheme = "Scheme C";
		}else if((salary < 5000)&&(salary >= 3000)){
			this.designation = "Clerk";
			this.insuranceScheme = "No Scheme";
		}else {
			throw new EmployeeException("Salary cannot be less than 3000");
		}
	}
	public String getDesignation() {
		return designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, id, insuranceScheme, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && id == other.id
				&& Objects.equals(insuranceScheme, other.insuranceScheme) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
}