package com.sanyasdada.reversedString;

import java.util.Calendar;
import java.util.Locale;

public class Numbers {
	public static void main(String[] args) {
		  long n = 46101;
		  int i =720;
	
		  System.out.format("%d%n", i);
		  
		// where format specifiers (%) and end with converter
		// %n  refers to the next line and %d is the decimal integer
	      System.out.format("%d%n", n);      //  -->  "461012"
	      
	    //08 indicates the Eight character in width, with leading zeroes as necessary    
	      System.out.format("%08d%n", n);    //  -->  "00461012"
	      System.out.format("%+8d%n", n);    //  -->  " +461012"
	      System.out.format("%,8d%n", n);    // -->  " 461,012"
	      System.out.format("%+,8d%n", n); //  -->  "+461,012"
	      
	      double pi = Math.PI;
          // - refers to Let-justified
	      System.out.format("%f%n", pi);       // -->  "3.141593"
	      System.out.format("%.3f%n", pi);     // -->  "3.142"
	      System.out.format("%010.3f%n", pi);   // -->  "     3.142"
	      System.out.format("%-10.3f%n", pi);  // -->  "3.142"
	      System.out.format(Locale.FRANCE,
	                        "%-10.4f%n%n", pi); // -->  "3,1416"
		/*
		 * tB -->>on- A date & time conversion--locale-specific full name of month 
		 * td,td -->> A date & time conversion 2-digit day of month . td leading zeroes as
		 * needed,te does not
		 * ty,tY ->> A date & time conversion -> ty= 2digit year,tY =4-digit year
		 */
	      Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
	      
		/*
		 * tl->>hour in 12-hour clock 
		 * tp->> locale-specific am/pm(lowercase) 
		 * tm->>months in 2 digits, with leading zeroes as necessary 
		 */
	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
       // tD->> date as %tm%td%ty
	      System.out.format("%tD%n", c);    // -->  "05/29/06"
	}

}
