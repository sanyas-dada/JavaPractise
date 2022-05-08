package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemoTest {
	public static void main(String[] args) {
		 List<Integer>favNumber = new ArrayList<>();
		 favNumber.add(3);
		 favNumber.add(1);
		 favNumber.add(2);
		 favNumber.add(6);
		 favNumber.add(7);
		 favNumber.add(9);
		 
		 favNumber.stream().map(x -> x*x).forEach(x ->System.out.println(x));
		 System.out.println("Next line is comming");
		 favNumber.stream().map(x -> x*x*x).forEach(x ->System.out.println(x));
		 System.out.println("i am feeling good right now by doing ");
		 
		 // get the steam objects 
		  Stream<Integer> openStream = favNumber.stream();
		  // configure stream by filtering out required values
		  Stream<Integer> filter = openStream.filter(i -> i>=5);
		  List<Integer> collect = filter.collect(Collectors.toList());
		  collect.stream().forEach(x ->System.out.println(x));
		  
		  // collect demo 
		  favNumber.stream()
		           .filter(i -> i>=5)
		           .collect(Collectors.toList())
		           .forEach(x -> System.out.println(x));
		  // count demo
		  long count = favNumber.stream().filter(i -> i>=5).count();
		  System.out.println("Number of element in the favNumber list:" +count);
		  long count2 = favNumber.stream().count();
		  System.out.println("Number of element in the favNumber list without filtering and mapping:" +count2);
		  
		  // sorted demo
		   favNumber.stream()
		            .filter(i -> i>=6) // it is optinal for using filter and mapping
		            .sorted()
		            .collect(Collectors.toList())
		            .forEach(x -> System.out.println(x));
		  
		   System.out.println("Sorted in descending order");
		   
		   favNumber.stream()
		            .filter(i -> i>=3)
		            .sorted((i1,i2) -> i2.compareTo(i1))
		            .forEach(x -> System.out.println(x));
		   System.out.println("Sorted in ascending order");
		   
		   favNumber.stream()
		   .filter(i -> i>=3)
		   .sorted((i1,i2) -> i1.compareTo(i2))
		   .forEach(x -> System.out.println(x));
		   
		   
		   
		  

		   
	}

}

