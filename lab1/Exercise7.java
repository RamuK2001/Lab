package lab1;

/*
 * Create a method to check if a number is an increasing number
 * A number is said to be an increasing number if no digit is exceeded by the digit to its left.
 * For Example : 134468 is an increasing number
 */

public class Exercise7 {
	public boolean checkNumber(int n) {
		String s = Integer.toString(n);
		for(int i = 0;i < s.length()-1;i++) {
			if(Character.getNumericValue(s.charAt(i)) > Character.getNumericValue(s.charAt(i+1))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n = 123;
		Exercise7 e = new Exercise7();
		System.out.println(e.checkNumber(n));
	}
}