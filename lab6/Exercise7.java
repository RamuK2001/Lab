package lab6;

/*
 * Create a method which accepts an integer array, reverse the numbers in the 
 * array and returns the resulting array in sorted order.
 * Hint
 * 1. Convert the numbers to String to reverse it
 * 2. Use Collection APIs to sort it
 */

import java.util.*;

public class Exercise7 {
	public int[] getSorted(int []a) {
		String []s = new String[a.length];
		for(int i = 0;i < a.length;i++) {
			StringBuilder t = new StringBuilder(Integer.toString(a[i]));
			s[i] = t.reverse().toString();
		}
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0;i < a.length;i++) {
			l.add(Integer.valueOf(s[i]));
		}
		Collections.sort(l);
		for(int i = 0;i < a.length;i++) {
			a[i] = l.get(i);
		}
		return a;
	}
	public static void main(String[] args) {
		int []a = {123,423,124,312,421,431};
		Exercise7 e = new Exercise7();
		System.out.println(Arrays.toString(e.getSorted(a)));
	}
}