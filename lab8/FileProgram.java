package lab8;

/*
 * Write a program to do the following operations using Thread:
 * • Create an user defined Thread class called as “CopyDataThread .java” .
 * • This class will be designed to copy the content from one file “source.txt ” 
 *   to another file “target.txt” and after every 10 characters copied, “10 characters are copied” 
 *   message will be shown to user.(Keep delay of 5 seconds after every 10 characters read.)
 * • Create another class “FileProgram.java” which will create above thread. Pass required File 
 *   Stream classes to CopyDataThread constructor and implement the above functionality.
 */

import java.io.*;
import java.lang.Thread;

class CopyDataThread extends Thread{
	File a = null;
	File b = null;
	FileInputStream in = null;
	FileOutputStream out = null;
	CopyDataThread(File a,File b){
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
public class FileProgram{
	public static void main(String[] args) {
		File a = new File("C:\\Users\\RAMAKARN\\eclipse-workspace\\Lab Projects\\src\\source.txt");
		File b = new File("C:\\Users\\RAMAKARN\\eclipse-workspace\\Lab Projects\\src\\target.txt");
		CopyDataThread cct = new CopyDataThread(a,b);
		cct.start();
	} 
}