package lab6;

/*
 * Create a method which accepts the id and the age of people as 
 * a Map and decide if they are eligible for vote. A person is eligible 
 * for vote if his age is greater than 18. Add the IDs of all the eligible 
 * persons to list and return the list.
 */

import java.util.*;

public class Exercise6 {
	public List<Integer> votersList(Map<Integer,Integer> p){
		List<Integer> l = new ArrayList<Integer>();
		for(Integer i : p.keySet()) {
			if(p.get(i) > 18) {
				l.add(i);
			}
		}
		return l;
	}
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(1,15);
		hm.put(2,20);
		hm.put(3,21);
		hm.put(4,18);
		hm.put(5,40);
		Exercise6 e = new Exercise6();
		List<Integer> l = e.votersList(hm);
		System.out.println(l);
	}
}