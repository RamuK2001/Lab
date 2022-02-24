package lab6;

/*
 * Create a method which accepts an array of numbers and 
 * returns the numbers and their squares in Hashmap.
 * Iterate through the list, find the square of each
 * number and add the elements to a map object
 * with the number as the key and the square as the value
 */

import java.util.*;

public class Exercise3 {
	public Map<Integer,Integer> getSquares(int []a){
		Map<Integer,Integer> gs = new HashMap<Integer,Integer>();
		for(int i : a) {
			gs.put(i, i*i);
		}
		return gs;
	}
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		Exercise3 e = new Exercise3();
		Map<Integer,Integer> gs = e.getSquares(a);
		System.out.println(gs);
	}
}