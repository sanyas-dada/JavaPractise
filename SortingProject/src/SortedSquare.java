import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedSquare {
	
		//int [] anotherArray = new int[nums.length];
		
	

	public static void main(String[] args) {
		SortedSquare sorted = new SortedSquare();
		
		int[] nums = {4,8,3,2,5,6,7};
		
		SortedMap<Integer,Integer>mappingList = new TreeMap<>();
		for(int i = 0;i<nums.length;i++) {
			mappingList.put(i,nums[i]*nums[i]);
		}
		System.out.println(mappingList);
		   Integer firstKey= mappingList.firstKey();
		 		Integer integer = mappingList.get(firstKey);
	
	    System.out.println("firstKey "+firstKey+" --> " + integer);
	  Collection<Integer> values = mappingList.values();
	 System.out.println(values);
	
	}
	
	
	

}
