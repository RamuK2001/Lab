package lab9_lambda;

/*
 * Write a method to calculate factorial of a number. Test this method using method
 * reference feature.
 */

@FunctionalInterface
interface If5{
	int fatorial(int n);
}

public class Exercise5 {
	int factorial(int n) {
		int r = 1;
		for(int i = 2;i <= n;i++) {
			r *= i;
		}
		return r;
	}
	public static void main(String[] args) {
		Exercise5 e = new Exercise5();
		If5 if5 = e::factorial;
		System.out.println(if5.fatorial(5));
	}
}