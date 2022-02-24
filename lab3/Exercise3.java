package lab3;

/*
 * Create a method which accepts a String and replaces all the 
 * consonants in the String with the next alphabet.
 * For Example :JAVA should be changed as KAWA
 */

public class Exercise3 {
	public String alterString(String s) {
		char []t = {'a','e','i','o','u'};
		String r = "";
		for(int i = 0;i < s.length();i++) {
			char c = s.charAt(i);
			boolean f = true;
			for(int j = 0;j < 5;j++) {
				if((c == t[j])||(c+32 == t[j])) {
					f = false;
					break;
				}
			}
			if(f == true) {
				c += 1;
			}
			r += c;
		}
		return r;
	}
	public static void main(String[] args) {
		String s = "JAVA";
		Exercise3 e = new Exercise3();
		System.out.println(e.alterString(s));
	}
}