package test;

import java.io.*;

public class CopyData {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream(new File("C:\\Users\\RAMAKARN\\eclipse-workspace\\Lab Projects\\src\\Source.txt"));
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\RAMAKARN\\eclipse-workspace\\Lab Projects\\src\\Destination.txt"));
		try {
			int n;
			while((n = in.read()) != -1) {
				out.write(n);
			}
		}finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
			System.out.println("Copied successfully");
		}
	}
}