package lab2;

/*
 * Create a method which accepts an integer array 
 * and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 */

import java.util.Arrays;

public class Exercise4 {
	public int[] modifyArray(int []n) {
		int []t = new int[n.length];
		int i,j = 0;
		Arrays.sort(n);
		for(i = n.length-1;i > 0;i--) {
			if(n[i] != n[i-1]) {
				t[j++] = n[i];
			}
		}
		t[j++] = n[0];
		int []k = new int[j];
		for(i = 0;i < j;i++) {
			k[i] = t[i];
		}
		return k;
	}
	public static void main(String[] args) {
		int []n = {100,12,12,31,321,13,12,31};
		Exercise4 e = new Exercise4();
		System.out.println(Arrays.toString(e.modifyArray(n)));
	}
}