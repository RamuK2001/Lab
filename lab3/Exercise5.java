package lab3;

/*
 * Write a Java program that displays the 
 * number of characters, lines and words in a text?
 */

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		int l = 0,w = 0,c = 0;
		while(in.hasNextLine()) {
			s = in.nextLine();
			if(s.length() == 0) {
				break;
			}
			l += 1;
			w += s.split("\s+").length;
			c += s.length();
		}
		in.close();
		System.out.println("Number of characters: "+c+"\nNumber of words: "+w+"\nNumber of lines: "+l);
	}
}