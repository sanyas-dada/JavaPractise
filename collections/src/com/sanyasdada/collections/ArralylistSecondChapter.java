package com.sanyasdada.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArralylistSecondChapter {
	
	private static int[] nums2;

	public static void main(String[] args) {
		nums2 = new int[] {1,2,3,4,5,6,7,8,9,10};
	for(int i = 0;i<nums2.length;i++) {
		if(i%2==0) {
			System.out.println("List of the odd elements consists of:"+nums2[i]);
		}else {
			System.out.println("List of the even elements consists of:"+nums2[i]);
		}
	}
		List<String> goals = new ArrayList<String>();
		goals.add("MakingPowerfulApplication");
		goals.add("Businessman");
		goals.add("CEO");
		goals.add("Millionare");
		goals.add("Billionare");
		System.out.println("Before the copying the list of elements:"+"\n"+Arrays.asList(goals));
		System.out.println("___^^^^____***____");
		
		List<String>newgoals= new ArrayList<>();
		newgoals.add("DeeplyThinker");
		newgoals.add("SmartThinker");
		newgoals.add("SmartStudent");
		newgoals.add("SharpMemory");
		newgoals.add("Genius");
		newgoals.add("Unstoppable");
		newgoals.add("ActionTaker");
		Collections.copy(newgoals, goals);
		System.out.println("After the copying the elements into new goals: "+Arrays.asList(newgoals));

		// Shuffling the elements from the list
		System.out.println("Before Shuffling the element element :" + newgoals);
		Collections.shuffle(newgoals);
		System.out.println("After shuffling the Element:" + newgoals);
		// Sorting the elements Using the Collections.sort method
		Collections.sort(newgoals);
		System.out.println("sorting the element in the newgoals:" + newgoals);
		
	

	   // Extracting the portion of the list from theGoals
		List<String> subList = newgoals.subList(2, 5);
		System.out.println(subList);
	
		
		
	}

}
