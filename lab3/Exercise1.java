package lab3;

/*
 * Write a Java program that reads a line of integers and then 
 * displays each integer and the sum of all integers. 
 * (Use String Tokenizer class)?
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,sum = 0;
		String s = in.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			String t = st.nextToken();
			n = Integer.parseInt(t);
			System.out.println(n);
			sum += n;
		}
		System.out.println(sum);
		in.close();
	}
}