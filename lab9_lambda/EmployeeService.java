package lab9_lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	public static void main(String[] args) {
		EmployeeRepository e = new EmployeeRepository();
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101,"fn1","ln1","email1","pn1",LocalDate.of(2020,6,12),"dn1",10000,201,new Department(301,"dep1",201)));
		empList.add(new Employee(102,"fn2","ln2","email2","pn2",LocalDate.of(2021,9,12),"dn2",50000,202,new Department(302,"dep2",202)));
		empList.add(new Employee(103,"fn3","ln3","email3","pn3",LocalDate.of(2020,9,12),"dn3",20000,201,new Department(301,"dep1",201)));
		empList.add(new Employee(104,"fn4","ln4","email4","pn4",LocalDate.of(2022,1,12),"dn4",80000,203,new Department(303,"dep3",203)));
		empList.add(new Employee(105,"fn5","ln5","email5","pn5",LocalDate.of(2021,5,12),"dn5",30000,202,new Department(302,"dep2",202)));
		empList.add(new Employee(106,"fn6","ln6","email6","pn6",LocalDate.of(2020,5,12),"dn6",40000,201,new Department(301,"dep1",201)));
		empList.add(new Employee(107,"fn7","ln7","email7","pn7",LocalDate.of(2020,6,18),"dn7",40000,201,new Department(301,"dep1",201)));
		empList.add(new Employee(108,"fn8","ln8","email8","pn8",LocalDate.of(2022,1,15),"dn8",50000,203,new Department(303,"dep3",203)));
		empList.add(new Employee(109,"fn9","ln9","email9","pn9",LocalDate.of(2021,8,12),"dn9",80000,202,new Department(302,"dep2",202)));
//		System.out.println(e.sumOfSalaries(empList));
//		System.out.println(e.countOfEmployeesInDepartment(empList));
//		System.out.println(e.seniorMostEmployee(empList));
//		System.out.println(e.nameAndDuration(empList));
//		System.out.println(e.salaryIncreased(empList));
	}
}