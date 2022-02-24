package lab1;

/*
 * Create a class with a method which can calculate the sum of first n natural numbers 
 * which are divisible by 3 or 5.
 */

public class Exercise5 {
	public int calculateSum(int n) {
		int s = 0;
		for(int i = 3;i <= n;i += 3) {
			if(i%5 != 0) {
				s += i;
			}
		}
		for(int i = 5;i <= n;i += 5) {
			s += i;
		}
		return s;
	}
	public static void main(String[] args) {
		int n = 100;
		Exercise5 e = new Exercise5();
		System.out.println(e.calculateSum(n));
	}
}