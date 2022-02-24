package lab6;

/*
 * Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
 * Hint: 
 * 1. Convert to Array List 
 * 2. Use sort method in Collections class
 */

import java.util.*;

public class Exercise5 {
	public int getSecondSmallest(int []a) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i : a) {
	    	l.add(new Integer(i));
	    }
		Collections.sort(l);
		for(int i = 0;i < l.size()-1;i++) {
			if((int)l.get(i) != (int)l.get(i+1)) {
				return (int) l.get(i+1);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []a = {5,3,2,1,4};
		Exercise5 e = new Exercise5();
		System.out.println(e.getSecondSmallest(a));
	}
}