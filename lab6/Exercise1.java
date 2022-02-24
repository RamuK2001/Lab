package lab6;

/*
 * Create a method which accepts a hash map and 
 * return the values of the map in sorted order as a List.
 * Return the values of a hash map in sorted order
 */

import java.util.*;

public class Exercise1 {
	public List<Map.Entry<String,Integer>> getValues(HashMap<String,Integer> hm) {
		List<Map.Entry<String,Integer>> l = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(l,new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String,Integer> m1,Map.Entry<String,Integer> m2) {
				return m1.getValue().compareTo(m2.getValue());
			}
		});
		return l;
	}
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("1",1);
		hm.put("3",3);
		hm.put("2",2);
		hm.put("5",5);
		hm.put("4",4);
		Exercise1 e = new Exercise1();
		List<Map.Entry<String,Integer>> l = e.getValues(hm);
		for(Map.Entry<String,Integer> i: l){
			System.out.println(i.getKey()+":"+i.getValue());
		}
	}
}