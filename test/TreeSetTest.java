package test;

import java.util.*;

public class TreeSetTest {
	public static void main(String[] args) {
		Set<Car> c = new TreeSet<Car>();
		c.add(new Car("BMW","Red"));
		c.add(new Car("Maruti","White"));
		c.add(new Car("BMW","Black"));
		c.add(new Car("Maruti","Blue"));
		c.add(new Car("Maruti","Blue"));
		c.add(new Car("BMW","Red"));
		System.out.println(c);
		Set<Bank> b = new TreeSet<Bank>(new Comparator<Bank>() {
			public int compare(Bank a,Bank b) {
				if(a.branch.compareTo(b.branch) == 0) {
					if(a.noc == b.noc) {
						return a.year - b.year;
					}else {
						return a.noc - b.noc;
					}
				}
				return a.branch.compareTo(b.branch);
			}
		});
		b.add(new Bank("VNSP",1000,2000));
		b.add(new Bank("HYT",1200,2000));
		b.add(new Bank("VNSP",1000,1900));
		b.add(new Bank("HYT",1200,2000));
		b.add(new Bank("VNSP",1200,2010));
		b.add(new Bank("HYT",1500,1900));
		System.out.println(b);
	}
}