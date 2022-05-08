package diagonalPatterns;

public class DiagonalPattern {
	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print(" "); } int n = i; if (n == i) { System.out.print("*"); n++;
		 * }
		 * 
		 * System.out.println(); }
		 */
		for(int i = 0; i < 5; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print("0");
				if(i==j) {
					System.out.print("1");	
				}
			}
			for(int x=1;x<=i;x++) {
				for(int k=1;k<=x;k++) {
					System.out.print(" ");
					if(k==x) {
						System.out.print("1");	
					}
					
				}
				
				
			}
			System.out.println();
		}
	}

}
