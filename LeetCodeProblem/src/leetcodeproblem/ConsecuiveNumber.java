package leetcodeproblem;

public class ConsecuiveNumber {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 0,0,1, 1, 1, 1 };
		int length = nums.length;
		System.out.println(length);
		int sum = 0;
		int max = 0;
		int temp = 0;
		// can you figure out the mistake in this code
		// i believe in you , kanchha you can do it.
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				sum = sum + 1;
			}else{
				sum = 0;
			}
			temp = Math.max(sum, temp);
		}
		System.out.println(temp);

	}

}
