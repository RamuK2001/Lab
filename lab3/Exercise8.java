package lab3;

/*
 * Create a method that accepts a String and 
 * checks if it is a positive string. A string is 
 * considered a positive string, if on moving from 
 * left to right each character in the String comes after 
 * the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String 
 * (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 */

public class Exercise8 {
	public boolean checkString(String s) {
		for(int i = 0;i < s.length()-1;i++) {
			if(s.charAt(i) > s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Exercise8 e = new Exercise8();
		String s = "ANT";
		System.out.println(e.checkString(s));
	}
}