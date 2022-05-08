package javaPatterns;

public class FirstPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Right sided triangle
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}			
		for(int k= 0;k<4;k++) {
			for(int l = 4;l>k;l--) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		System.out.println("i am on the track");
		//right angle  triangle
		for(int k= 0;k<5;k++) {
			for(int l = 5;l>k;l--) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		for(int i =0;i<5;i++) {
			for(int n = 1;n<=i;n++) {
				System.out.print(" ");
			}
			for(int j = 5;j>i;j--) {
				System.out.print("*");
			}
			for(int o = 4;o>i;o--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
 
}
