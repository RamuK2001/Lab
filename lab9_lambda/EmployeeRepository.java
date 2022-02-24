package lab9_lambda;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRepository {
	public double sumOfSalaries(List<Employee> empList) {
		return empList.stream().mapToDouble(x -> x.getSalary()).sum();
	}
	public HashMap<String,Integer> countOfEmployeesInDepartment(List<Employee> empList){
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(int i = 0;i < empList.size();i++) {
			String s = empList.get(i).getDepartment().getDepartmentName();
			if(!(hm.containsKey(s))) {
				hm.put(s,(int) empList.stream().filter(str -> str.getDepartment().getDepartmentName().equals(s)).count());
			}
		}
		return hm;
	}
	public Employee seniorMostEmployee(List<Employee> empList) {
		Employee e = empList.stream().min((a,b) -> a.getHireDate().compareTo(b.getHireDate())).get();
		return e;
	}
	public List<String> nameAndDuration(List<Employee> empList){
		List<String> al = new ArrayList<String>();
		LocalDate p = LocalDate.now();
		empList.stream().forEach(e -> al.add(e.getFirstName()+" "+e.getLastName()+" "+Period.between(e.getHireDate(),p).toTotalMonths()+
				                            	" months "+Period.between(e.getHireDate(),p).getDays()+" days"));
		return al;
	}
	public List<Employee> salaryIncreased(List<Employee> empList){
		List<Employee> al = empList.stream().map(e -> new Employee(e.getEmployeeId(),e.getFirstName(),e.getLastName(),e.getEmail(),e.getPhoneNumber(),
				                e.getHireDate(),e.getDesignation(),e.getSalary() + e.getSalary()*0.15,e.getManagerId(),e.getDepartment())).collect(Collectors.toList());
		return al;
	}
}