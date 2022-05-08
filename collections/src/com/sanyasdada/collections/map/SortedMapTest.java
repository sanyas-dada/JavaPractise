package com.sanyasdada.collections.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*  The main characteristics of a SortedMap is that, it 
  orders the keys by their natural ordering, or by a specified comparator.
  So consider using a TreeMap when you want a map that satisfies the following criteria:
   .null key or null value are not permitted.
   .The keys are sorted either by natural ordering or by specified comparator.
*/

public class SortedMapTest {
	public static void main(String[] args){
		SortedMap<String,String>mapDreams = new TreeMap<>();
		
	   mapDreams.put(".wh", "workahalic");
	   mapDreams.put(".pen","patience");
	   mapDreams.put(".cons","consistence");
	   mapDreams.put(".sm", "self-motivated");
	   mapDreams.put(".sd","self-discipline");
	   System.out.println("mapDreams: "+ mapDreams);
	   
	   String firstKey = mapDreams.firstKey();
	   System.out.println("firstKey:"+firstKey);
	   
	   String lastKey = mapDreams.lastKey();
	   System.out.println("lastKey: "+ lastKey);
	   
	    SortedMap<String, String> headMap = mapDreams.headMap(".sm");
	   System.out.println("headMap: "+headMap);
	   
	   SortedMap<String, String> tailMap = mapDreams.tailMap(".sd");
	   System.out.println("tailmap: "+tailMap);
	   
	   SortedMap<String, String> subMap = mapDreams.subMap(".pen", ".sm");
	   System.out.println("subMap:"+subMap);
	   
	   
	   Set<String> keySet = mapDreams.keySet();
	   System.out.println("keySet:"+keySet);
	   
	   Collection<String> values = mapDreams.values();
	   System.out.println("listOfvalues:"+values);
	   
	   System.out.println(mapDreams.get(".cons"));
	   
	       Iterator<String> iterator = keySet.iterator();
	       while(iterator.hasNext()) {
	    	   String next = iterator.next();
	    	   String string = mapDreams.get(next);
	    	   System.out.println(next+"-->"+string);
	       }
	        System.out.println("rock and rolls kanchaa.burst it do it right now");
	      // Using for loop  
	       for(String s:mapDreams.keySet()) {
	    	   System.out.println(s+"-->>"+mapDreams.get(s));
	       }
	   
	}
}
