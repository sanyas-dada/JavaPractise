package leetcodeproblem.array;

public class EvenNumberOfDigit {

	public static void main(String[] args) {
		int[] numbers = { 12, 345, 2, 6, 7896, 22, 24 };
		int digitNumber = 0;
		int evenCount = 0;
        int oddCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			while (numbers[i] > 0) {
				digitNumber = digitNumber + 1;
				numbers[i] /= 10;
			}
			if (digitNumber % 2 == 0) {
				evenCount += 1;
		        digitNumber = 0;
			}else {
				oddCount +=1;
				digitNumber = 0;
			}
			
		}
		System.out.println("evenNumber of digit:"+evenCount);
		System.out.println("evenNumber of digit:"+oddCount);

	}

}
