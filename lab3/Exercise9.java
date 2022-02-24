package lab3;

/*
 * Create a method to accept date and print the duration in 
 * days, months and years with regards to current system date.
 */

import java.time.LocalDate;
import java.time.Period;

public class Exercise9 {
	public void printDifference(LocalDate d) {
		LocalDate t = LocalDate.now();
		Period p = Period.between(d, t);
		System.out.println("Duration is: "+p.getDays()+" days, "+p.getMonths()+" months, "+p.getYears()+" years.");
	}
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2020,1,1);
		Exercise9 e = new Exercise9();
		e.printDifference(d);
	}
}