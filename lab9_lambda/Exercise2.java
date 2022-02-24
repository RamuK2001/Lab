package lab9_lambda;

/*
 * Write a method that uses lambda expression to format a given string, where a space
 * is inserted between each character of string. For ex., if input is “CG”, then expected output is “C G”.
 */

@FunctionalInterface
interface If2{
	String format(String s);
}

public class Exercise2 {
	public static void main(String[] args) {
		If2 if2 = (String s) -> {
			String r = "";
			for(char c : s.toCharArray()) {
				r += c + " ";
			}
			return r;
		};
		System.out.println(if2.format("Hello"));
	}
}