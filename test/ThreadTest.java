package test;

class ThreadA extends Thread{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}

class ThreadB implements Runnable {
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}

public class ThreadTest{
	public static void main(String[] args) {
		for(int i = 0;i < 5;i++) {
			ThreadA t = new ThreadA();
			t.start();
			System.out.println(t.toString());
		}
//		for(int i = 0;i < 10;i++) {
//			Thread t = new Thread(new ThreadB());
//			t.start();
//		}
	}
}