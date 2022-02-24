package lab1;

/*
 * Create a class with a method to find the difference between the sum of the squares 
 * and the square of the sum of the first n natural numbers.
 * Find the difference between the sum of the squares of the first n natural numbers and the square of their sum.
 * For Example if n is 10,you have to find
 * (1^2+2^2+3^2+….9^2+10^2)-(1+2+3+4+5…+9+10)^2
 */

public class Exercise6 {
	public int calculateDifference(int n) {
		int d = 0,a = 0,b = 0;
		for(int i = 1;i <= n;i++) {
			a += i*i;
			b += i;
		}
		d = a - b*b;
		return d;
	}
	public static void main(String[] args) {
		int n = 10;
		Exercise6 e = new Exercise6();
		System.out.println(e.calculateDifference(n));
	}
}