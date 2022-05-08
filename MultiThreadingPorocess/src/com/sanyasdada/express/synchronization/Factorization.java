package com.sanyasdada.express.synchronization;

import java.util.Arrays;

public class Factorization {
   public static void main(String[] args) {
	   int[] array = new int[10];
	   int j=0;
	   int n=6;
	   int count=0;
	     
	   for(int i=1; i<=n; i++) {
		   if(n%i==0) {
			   count++;
			   array[j] = i;
			   j++;
		   }
	   }
	   System.out.println("factor of 6 :" +Arrays.toString(array));
	   System.out.println("factor of 100 are:"+Arrays.toString(array));
	   System.out.println("Total numbers of factor: "+count);
	   
	   
   }
}
