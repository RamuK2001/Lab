package lab9;

import java.util.concurrent.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Thread;

class FileProgramExercise implements Runnable{
	File a = null;
	File b = null;
	FileInputStream in = null;
	FileOutputStream out = null;
	FileProgramExercise(File a,File b){
		this.a = a;
		this.b = b;
	try {
		in = new FileInputStream(a);
		out = new FileOutputStream(b);
	} catch (FileNotFoundException e) {}
	}
	public void run(){
		try {
			int n,c = 1;
			while((n = in.read()) != -1) {
				if(c%10 == 0) {
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
				}
				out.write(n);
				c++;
			}
			System.out.println("All characters copied");
		} catch (IOException | InterruptedException e) {
		}finally {
			try {
				if(in != null)
					in.close();
				if(out != null)
					out.close();
			}catch(IOException e) {}
		}
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		File a = new File("C:\\Users\\RAMAKARN\\eclipse-workspace\\Lab Projects\\src\\source.txt");
		File b = new File("C:\\Users\\RAMAKARN\\eclipse-workspace\\Lab Projects\\src\\target.txt");
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new FileProgramExercise(a,b));
	}
}