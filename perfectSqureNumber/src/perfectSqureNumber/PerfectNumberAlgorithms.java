package perfectSqureNumber;

public class PerfectNumberAlgorithms {
	
	public static  boolean perfectFactorNumber(int n) {
		int sum =0;
		for(int i=1; i<=n/2;i++) {
			if(n%i == 0) {
				sum = sum+i;
			}
		}
		if(sum==n)
			return true;
		return false;
	}

	public static void main(String[] args) {
		boolean perfect = perfectFactorNumber(28);
		if(perfect) {
			System.out.println("This is a perfect Number");
		}else {
			System.out.println("this is not a perfect Number");
		}
		for(int i = 1;i<10;i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
				i++;
			}
		}
		
		
		
	}
		

}
