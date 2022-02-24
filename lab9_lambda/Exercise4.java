package lab9_lambda;

/*
 * Write a class with main method to demonstrate instance creation using method
 * reference. (Hint: Create any simple class with attributes and getters and setters)
 */

@FunctionalInterface
interface If4{
	Department getDepartment(int id,String name,int mgrid);
}

public class Exercise4 {
	public static void main(String[] args) {
		If4 if4 = Department::new;
		Department d1 = if4.getDepartment(101,"A",201);
		Department d2 = if4.getDepartment(102,"B",202);
		Department d3 = if4.getDepartment(103,"C",203);
		System.out.println(d1+"\n"+d2+"\n"+d3);
	}
}