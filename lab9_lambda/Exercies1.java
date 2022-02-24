package lab9_lambda;

/*
 * Write a lambda expression which accepts x and y numbers and return xy.
 */

@FunctionalInterface
interface If1{
	int pow(int x,int y);
}

public class Exercies1 {
	public static void main(String[] args) {
		If1 if1 = (int x,int y) -> (int)Math.pow(x, y);
		System.out.println(if1.pow(5, 3));
	}
}