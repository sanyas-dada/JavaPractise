package leetcodeproblem;

public class MaximumRepeatingNumber {

	public static void main(String[] args) {
		int[] array;
		array = new int[] { 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1 };

		int sum = 0;
		int check = 0;
		int temp = 0;
		int temp1 = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 1) {
				sum = sum + 1;
				temp1 = check;
				check = 0;

			} else {
				check = check + 1;
				temp = sum;
				sum = 0;
			}

		}
		int max = Math.max(sum, temp);
		int max1 = Math.max(check, temp1);
		int max2 = Math.max(max, max1);
		System.out.println("maximum repeating number:" + max2);

	}

}
