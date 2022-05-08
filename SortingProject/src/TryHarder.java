
public class TryHarder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 5, 6, 8, 3, 7, 4, 9, 2 };

		for(int i = 0; i < nums.length; i++) {
			int min = i-1;
			int j = i;
			while (nums[j - 1] > nums[j] && nums[min] >= nums[j]) {
				nums[j - 1] = nums[j];
				j--;

			}
			j++;
		}
		for (int i = 1; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
