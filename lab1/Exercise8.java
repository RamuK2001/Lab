package lab1;

/*
 * Create a method to check if a number is a power of two or not
 * Ex: 8 is a power of 2
 */

public class Exercise8 {
	public boolean checkNumber(int n) {
		if((n != 0)&&((n&(n-1)) == 0)) {
			return true;
		}
		return false;
		}
	public static void main(String[] args) {
		int n = 512;
		Exercise8 e = new Exercise8();
		System.out.println(e.checkNumber(n));
	}
}