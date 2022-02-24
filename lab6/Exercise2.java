package lab6;

/*
 * Create a method that accepts a character array and count 
 * the number of times each character is present in the array.
 */

import java.util.*;

public class Exercise2 {
	public Map<Character,Integer> countChars(char []c){
		HashMap<Character,Integer> cc = new HashMap<Character,Integer>();
		for(char i : c) {
			if(cc.containsKey(i)) {
				cc.put(i,cc.get(i)+1);
			}else {
				cc.put(i,1);
			}
		}
		return cc;
	}
	public static void main(String[] args) {
		char []c = {'a','b','c','a','d','b','a'};
		Exercise2 e = new Exercise2();
		Map<Character,Integer> cc = e.countChars(c);
		System.out.println(cc);
	}
}