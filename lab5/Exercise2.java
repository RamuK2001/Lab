package lab5;

/*
 * Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.
 */

import java.util.Scanner;

class MyException2 extends Exception{
	public MyException2(String s) {
		super(s);
	}
}

public class Exercise2 {
	public static void main(String[] args) throws MyException2{
		Scanner in = new Scanner(System.in);
		String fn = in.nextLine();
		String ln = in.nextLine();
		if((fn.length() == 0)||(ln.length() == 0)) {
			throw new MyException2("Name cannot be blank");
		}else {
			System.out.println(fn+" "+ln);
		}
		in.close();
	}
}