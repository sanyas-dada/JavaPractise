package leetcodeproblem.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedArrayInMap {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		// TODO Auto-generated method stub
		SortedMap<Integer,Integer>sortedNumber = new TreeMap<>();
	     for(int i =0;i<nums.length;i++) {
	    	 sortedNumber.put(i,nums[i] * nums[i]);
	     }
	    Set<Integer> keySet = sortedNumber.keySet();
	    System.out.println(keySet);
	    Collection<Integer> values = sortedNumber.values();
	    System.out.println(values);
	    System.out.println(Arrays.asList(values));
		

	}

}
