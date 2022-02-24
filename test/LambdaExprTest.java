package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@FunctionalInterface
interface If1{
	int sq(int n);
}

@FunctionalInterface
interface If2{
	String ct(String a,String b);
}

@FunctionalInterface
interface If3{
	void greaterThan50(int i);
}

@FunctionalInterface
interface If4{
	void evenNumbers(int i);
}

@FunctionalInterface
interface If5{
	int oddNumCount(ArrayList<Integer> a);
}

@FunctionalInterface
interface If6{
	ArrayList<Integer> sortList(ArrayList<Integer> a);
}

@FunctionalInterface
interface If7{
	void minAndMax(ArrayList<Integer> a);
}

public class LambdaExprTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(40,20,11,84,87,63,38,88));
		If1 if1 = (int n) -> n*n;
		If2 if2 = (String a,String b) -> a+b;
		System.out.println(if1.sq(5));
		System.out.println(if2.ct("Hello", " World"));
		al.forEach(i -> System.out.println(i));
		If3 if3 = (int i) -> {
			if(i > 50)
				System.out.println(i);
		};
		al.forEach(i -> if3.greaterThan50(i));
		If4 if4 = (int i) -> {
			if(i%2 == 0)
				System.out.println(i);
		};
		al.forEach(i -> if4.evenNumbers(i));
		If5 if5 = (ArrayList<Integer> a) -> {
			int c = 0;
			for(Integer i : al) {
				if(i%2 != 0)
					c++;
			}
			return c;
		};
		System.out.println(if5.oddNumCount(al));
		If6 if6 = (ArrayList<Integer> a) -> {
			Collections.sort(a);
			return a;
		};
		System.out.println(if6.sortList(al));
		If7 if7 = (ArrayList<Integer> a) -> {
			int max = 0,min = Integer.MAX_VALUE;
			for(Integer i : a) {
				if(i < min)
					min = i;
				if(i > max)
					max = i;
			}
			System.out.println(min + " " + max);
		};
		if7.minAndMax(al);
	}
}