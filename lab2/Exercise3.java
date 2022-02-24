package lab2;

/*
 * Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns 
 * the resulting array in sorted order
 */

import java.util.Arrays;

public class Exercise3 {
	public int[] getSorted(int[] n) {
		int i,k,t;
		for(i = 0;i < n.length;i++) {
			k = n[i];
			n[i] = 0;
			while(k != 0) {
				t = k%10;
				n[i] = n[i]*10 + t;
				k = k/10;
			}
		}
		Arrays.sort(n);
		return n;
	}
	public static void main(String[] args) {
		int []n = {100,223,13,23,11,231,312};
		Exercise3 e = new Exercise3();
		System.out.println(Arrays.toString(e.getSorted(n)));
	}
}