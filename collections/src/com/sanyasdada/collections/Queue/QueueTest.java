package com.sanyasdada.collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
  public static void main(String[] args ) {
	  Queue<Integer>inline= new PriorityQueue<>();
	  Queue<String>fifo=new PriorityQueue<>();
	  //fifo.add("Imagiantion");
	  // fifo.add("Imagination")
	  //String remove2 = fifo.remove();
	  //System.out.println(remove2);
	  
		/*
		 * if(fifo.remove()==null) {
		 * System.out.println("it returns the null if the Queue is empty"); }else {
		 * System.out.println("it throws exception"); }
		 */
	  
	  //fifo.add("Feelling good");

	  if(fifo.poll()==null) {
		  System.out.println("It returns the null if the Queue is empty");		  
	  }else {
		  System.out.println("it throws exception");
		  
	  }
	  
	  fifo.add("feelling Good");
	  
	  // Retrieves the head of the Queue but doesn't reomve the head of the Queue, return null if isn't present in the head of the Element
	  String peek2 = fifo.peek();
	  System.out.println(peek2);
	  
	  
	  
	  inline.add(5);
	  inline.add(2);
	  inline.add(4);
	  inline.add(6);
	  inline.add(10);
	  inline.add(3);
	  inline.add(4);
	  System.out.println(inline);
	  
	  // Retrieves the head of the Queue but doesn't removes
	  //Returns null if this Queue is empty
	 
	  Integer peek = inline.peek();
	  System.out.println(peek);
	  System.out.println(inline);
	  
	  
	  
	  // Retrieves and remove the head of the Queue
	  // return null if this Queue is empty
	  Integer poll = inline.poll();
	  System.out.println(poll);
	  System.out.println(inline);
	  
	  // Removes the head of the Queue and it throws exception if Queue is empty
	  Integer remove = inline.remove();
	  System.out.println(remove);
	  System.out.println(inline);
	  
	  //Retrieves,doesn't removes ,the head of the Queue and it throws exception if Queue is empty
	  Integer element = inline.element();
	  System.out.println(element);
	  System.out.println(inline);
	  
	 
	  boolean offer = inline.offer(25);
	  System.out.println(offer);
	  System.out.println(inline);
	  System.out.println("Live your life such a way that everybody remeber if you dies");
	  System.out.println("Live your life such a way that everybody remember when you dies");
	  
	  
	  
	  //iterating over the stack element
	  Iterator<Integer> iterator = inline.iterator();
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
	  inline.add(50);
	  System.out.println(inline);
	  
	  
	  inline.remove();
	  System.out.println(inline);
	  
	  
	  
  }
  
}
