package com.sanyasdada.collections.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class InitializinQueue {
	public static void main(String[] args) {
		/*
		 * Most Queue implementaions do not have restriction on capacity (unbounded
		 * queues),except the ArrayBlockingQueue, LlinkedBlockingQueue and
		 * LinkedBlockingDeque classes The following statement creates an Array
		 * BlockingQueue
		 */
		List<String> listNames = Arrays.asList("Sanyas", "Laxmi", "Jyoti", "Verica", "verukola");

		Queue<String> namesQueue = new LinkedList<>(listNames);
		System.out.println(namesQueue);

		/*
		 * Adding New Elements to the Queue To insert and element to the tail of the
		 * queue, we can use either the add() or offer() method
		 */
		
		namesQueue.add("demetria");
		namesQueue.add("christina");
		System.out.println(namesQueue);

		Queue<String> dreamCityLists = new ArrayBlockingQueue<>(3);
		
		  dreamCityLists.add("NewworkCity"); 

		  dreamCityLists.add("China"); 
		  dreamCityLists.add("Russia");
		  System.out.println(dreamCityLists);
		 

		/*
		 * System.out.println(dreamCityLists.offer("Singapure"));
		 * System.out.println(dreamCityLists.offer("HongKong"));
		 * System.out.println(dreamCityLists.offer("London"));
		 * System.out.println(dreamCityLists.offer("Los-Vegas"));
		 */
		  Queue<String> names = new LinkedList<>();
		  names.offer("vattu");
		  String remove = names.remove();
		  System.out.println("i miss yo so much "+names);
		  System.out.println("i am wondering that you miss or not but be happy whererever you are vattu:"+remove);
		  // it gives the exception coz Queue is empty 
		  //remove = names.remove();
		  
		  
		  Deque<String>brotherLists= new ArrayDeque<>();
		  brotherLists.offer("Krishna");
		  brotherLists.offer("Bibash");
		  brotherLists.offer("Poshraj");
		  brotherLists.offer("Sanyas");
		  
		  System.out.println("Queue before: "+ brotherLists);
		  System.out.println("First comes: "+ brotherLists.pollFirst()); 
		  System.out.println("Last comes: "+ brotherLists.pollLast()); 
		  System.out.println("Queue after: "+ brotherLists);
		 
		  
		  
		  
		  
		  
		  
	}

}
