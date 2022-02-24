package lab2;

/*
 * Create a method that can accept an array of String objects and 
 * sort in alphabetical order. The elements in the left half should 
 * be completely in uppercase and the elements in the right half should 
 * be completely in lower case. Return the resulting array.
 * Note: If there are odd number of String objects, 
 * then (n/2) +1 elements should be in UPPPERCASE
 */

import java.util.Arrays;

public class Exercise2 {
	public String[] sortStrings(String[] s) {
		Arrays.sort(s);
		int i,n = s.length;
		if(n%2 == 0) {
			for(i = 0;i < n/2;i++) {
				s[i] = s[i].toUpperCase();
			}
			for(i = n/2;i < n;i++) {
				s[i] = s[i].toLowerCase();
			}
		}else {
			for(i = 0;i <= n/2;i++) {
				s[i] = s[i].toUpperCase();
			}
			for(i = n/2+1;i < n;i++) {
				s[i] = s[i].toLowerCase();
			}
		}
		return s;
	}
	public static void main(String[] args) {
		String []s = {"bca","cab","abc"};
		Exercise2 e = new Exercise2();
		System.out.println(Arrays.toString(e.sortStrings(s)));
	}
}