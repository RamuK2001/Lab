package lab3;

/*
 * Create a class containing a method to create the 
 * mirror image of a String. The method should 
 * return the two Strings separated with a pipe(|) symbol.
 * For Example
 * Input : EARTH
 * Output : EARTH|HTRAE
 */

public class Exercise2 {
	public String getImage(String s) {
		StringBuilder r = new StringBuilder(s);
		r.reverse();
		return s+"|"+r;
	}
	public static void main(String[] args) {
		String s = "EARTH";
		Exercise2 e = new Exercise2();
		System.out.println(e.getImage(s));
	}
}