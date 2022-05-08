
public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = { 5, 6, 8, 3, 7, 4, 9, 2 };

		for (int i = 1; i < nums.length; i++) {
			int key = nums[i];
			int j = i;
			while(j>0 && nums[j-1] >key) {
				nums[j] = nums[j-1];
				j--;
			}
			nums[j] = key;
			
			
		}
		for(int i =0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
