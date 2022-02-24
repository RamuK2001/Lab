package com.cg.eis.pl;

/*
 * This package will contain code for getting input from user, produce expected 
 * output to the user and invoke services offered by the system.
 * On the basis of above case study implement a class to accept 
 * multiple employee details and store all employee objects in a Hashmap. 
 * The functionalities need to be implemented are as follows:
 * • Add employee details to Hashmap.
 * • Accept insurance scheme from user and display employee details based on Insurance scheme.
 * • Delete an employee details from map.
 */

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeInsuranceSystem;

public class EmployeeModifier{
	public static void main(String[] args) throws EmployeeException {
		Scanner in = new Scanner(System.in);
		EmployeeInsuranceSystem eis = new EmployeeInsuranceSystem();
		Employee e1 = new Employee(101,"A",10000);
		Employee e2 = new Employee(102,"B",60000);
		Employee e3 = new Employee(103,"C",35000);
		Employee e4 = new Employee(104,"D",22000);
		Employee e5 = new Employee(105,"E",4000);
		eis.addEmployee(e1);
		eis.addEmployee(e2);
		eis.addEmployee(e3);
		eis.addEmployee(e4);
		eis.addEmployee(e5);
		System.out.println("Choose an option:\n1. Add employee details to Hashmap.\n2. Display employee details based on Insurance scheme.\n3. Delete an employee details from map.");
		while(in.hasNextInt()) {
			int n = in.nextInt();
			in.nextLine();
			if(n == 1) {
				System.out.println("Enter the employee details:");
				int id = in.nextInt();
				in.nextLine();
				String name = in.nextLine();
				int salary = in.nextInt();
				eis.addEmployee(new Employee(id,name,salary));
			}else if(n == 2) {
				System.out.println("Enter the Insurance Scheme:");
				String insuranceScheme = in.nextLine();
				eis.display(insuranceScheme);
			}else if(n == 3) {
				int id = in.nextInt();
				eis.delete(id);
			}else {
				System.out.println("Invalid option");
			}
			in.nextLine();
		}
		in.close();
	}
}