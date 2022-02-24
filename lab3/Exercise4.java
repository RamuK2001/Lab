package lab3;

/*
 * Create a method that accepts a number and modifies it such that the each of the 
 * digit in the newly formed number is equal to the difference between two 
 * consecutive digits in the original number. The digit in the units place can be left as it is.
 * Note: Take the absolute value of the difference. Ex: 6-8 = 2
 */


public class Exercise4 {
	public int modifyNumber(int n) {
		String s = Integer.toString(n);
		int r = 0;
		for(int i = 0;i < s.length()-1;i++) {
			int t = Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i+1)));
			r = r*10 + t;
		}
		return r*10 + Character.getNumericValue(s.charAt(s.length()-1));
	}
	public static void main(String[] args) {
		Exercise4 e = new Exercise4();
		int n = 3123;
		System.out.println(e.modifyNumber(n));
	}
}