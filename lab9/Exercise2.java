package lab9;

import java.util.Scanner;
import java.util.concurrent.*;

class Validator implements Runnable{
	Scanner in = new Scanner(System.in);
	public void run() {
		String s = in.nextLine();
		if(s.endsWith("_job")&&(s.length() > 11)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		in.close();
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new Validator());
	}
}