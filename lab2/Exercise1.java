package lab2;

/*
 * Create a method which accepts an array of integer elements and 
 * return the second smallest element in the array
 */

import java.util.Arrays;

public class Exercise1 {
	public int getSecondSmallest(int[] n) {
		Arrays.sort(n);
		for(int i = 0;i < n.length-1;i++) {
			if(n[i] != n[i+1]) {
				return n[i+1];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []n = {100,12,32,12,2124,13,2,412,213};
		Exercise1 e = new Exercise1();
		System.out.println(e.getSecondSmallest(n));
	}
}