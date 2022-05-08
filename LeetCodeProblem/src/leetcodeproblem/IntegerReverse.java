package leetcodeproblem;

public class IntegerReverse {
	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int rem = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8))
				return 0;
			rev = rev * 10 + rem;
		}
		return rev;
	}

	public static void main(String[] args) {
		IntegerReverse revInteger = new IntegerReverse();
		int mynumber = revInteger.reverse(1534236464);
		System.out.println(mynumber);

	}

}
