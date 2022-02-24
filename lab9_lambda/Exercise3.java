package lab9_lambda;

/*
 * Write a method that uses lambda expression to accept username and password and 
 * return true or false. (Hint: Use any custom values for username and password for authentication)
 */

@FunctionalInterface
interface If3{
	boolean authenticate(String u,String p);
}

public class Exercise3 {
	public static void main(String[] args) {
		If3 if3 = (String u,String p) -> {
			if(u.equals("A")&&p.equals("B"))
				return true;
			else
				return false;
		};
		System.out.println(if3.authenticate("C", "D"));
	}
}