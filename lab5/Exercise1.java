package lab5;

/*
 * Validate the age of a person and display proper message by using user defined exception. 
 * Age of a person should be above 15.
 */

import java.util.Scanner;

class MyException1 extends Exception{
	public MyException1(String s) {
		super(s);
	}
}

public class Exercise1 {
	public static void main(String[] args) throws MyException1 {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n <= 15){
			throw new MyException1("Age of a person should be above 15");
		}else {
			System.out.println("Age is valid");
		}
		in.close();
	}
}