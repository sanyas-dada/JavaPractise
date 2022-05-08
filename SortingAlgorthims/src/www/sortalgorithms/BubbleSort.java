package www.sortalgorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = {3,8,2,4,5,6,9,7};
		for(int i = 0;i<nums.length;i++) {
			for(int j = i;j<nums.length;j++) {
				if(nums[j]>nums[j+1]) {
				  int temp = nums[j];
				  nums[j] = nums[j+1];
				  nums[j+1] = temp;
					
				}
				
			}
		}
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
