package lab6;

/*
 * Write a function which accepts the marks of students as a 
 * Hashmap and return the details of the students eligible 
 * for the medals along with type of medal.
 * The input Hashmap contains the student registration number 
 * as key and mark as value.
 * The output Hashmap should contain the student registration 
 * number as key and the medal type as value.
 */

import java.util.*;

public class Exercise4 {
	public HashMap<String,String> getStudents(HashMap<String,Integer> sd){
		HashMap<String,String> md = new HashMap<String,String>();
	    for(String i : sd.keySet()) {
	    	if(sd.get(i) >= 90) {
	    		md.put(i,"Gold");
	    	}else if(sd.get(i) >= 80) {
	    		md.put(i,"Silver");
	    	}else if(sd.get(i) >= 70) {
	    		md.put(i,"Bronze");
	    	}
	    }
		return md;
	}
	public static void main(String[] args) {
		HashMap<String,Integer> sd = new HashMap<String,Integer>();
		sd.put("1",89);
		sd.put("2",91);
		sd.put("3",78);
		sd.put("4",93);
		sd.put("5",88);
		Exercise4 e = new Exercise4();
		HashMap<String,String> md = e.getStudents(sd);
		System.out.println(md);
	}
}