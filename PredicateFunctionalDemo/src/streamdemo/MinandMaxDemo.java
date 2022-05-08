package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinandMaxDemo {

	public static void main(String[] args) {
		 List<Integer>favNumber = new ArrayList<>();
		 favNumber.add(3);
		 favNumber.add(1);
		 favNumber.add(2);
		 favNumber.add(6);
		 favNumber.add(7);
		 favNumber.add(9);
		 // get the stream  object 
		 Stream<Integer> stream = favNumber.stream();
		 // configure stream by filtering out reuired calues 
		 Stream<Integer> file = stream.filter(x -> x>=5);
		 // u can sort on any stream filter or mapped or on normal st ream )non filter or non mapped too)
		  Integer min = file.min((i1,i2) -> i1.compareTo(i2)).get();
		  System.out.println(min);
		  
		  // using one line
		  Integer integer = favNumber.stream()
		           .filter(x -> x>=5)
		           .min((i1,i2) -> i2.compareTo(i1)).get();
		  System.out.println("minimum number of integer:" + integer);
		 
		  Integer integer2 = favNumber.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		  Integer integer3 = favNumber.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		  System.out.println("Mininum number of element in favNumber:"+integer2);
		  System.out.println("Maximum numberof elelment in the favNumber:"+integer3);
		  
		  
		  // How to process element using ForEach? 
		  // 1.forEach() is a ll now returned somethin, method
		  // 2.All methods that we saw till now returned something, like min max value, sorted collection, etc .
		  //But this method does not return anything.
		  // 3.Rather this method takes lambda expression as argument and apply that lambda expression to each element present in that steam.
		  
		  
		 
		  
		  
		  
		  
		  
		           
		           
		           
		 
	}

}
