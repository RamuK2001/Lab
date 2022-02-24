package lab8;

/*
 * Write a thread program to display timer where timer will get 
 * refresh after every 10seconds.( Use Runnable implementation )
 */

import java.util.Timer;
import java.util.TimerTask;

class ThreadA implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Task extends TimerTask{
	public void run() {
		Thread t = new Thread(new ThreadA());
		t.start();
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Task t1 = new Task();
	    Timer t = new Timer();
	    t.schedule(t1,0,10000);
	}
}