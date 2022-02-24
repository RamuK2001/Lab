package test;

public class Bank {
	public String branch;
	public int noc;
	public int year;
	Bank(String branch,int noc,int year){
		this.branch = branch;
		this.noc = noc;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Bank [branch=" + branch + ", noc=" + noc + ", year=" + year + "]";
	}
}