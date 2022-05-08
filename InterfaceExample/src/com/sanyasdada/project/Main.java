package com.sanyasdada.project;

public class Main {

	public static void main(String[] args) {
		
		// left triangle part
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("0");
			}
			System.out.println();
		}
		for(int i = 0;i<4;i++) {
			for(int k = 0;k<=i;k++) {
			  System.out.print(" ");
			}
			for(int j = 4;j>i;j--) {
			  System.out.print("1");
			}
			System.out.println();
		}
		System.out.println("i am on the track,oh god bless me");
		
		
		// double rounded Triangle
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("0");
			}
			for(int n = 1; n<=i;n++) {
			   System.out.print("1");
			}
			System.out.println();
		}
		for(int i = 0;i<4;i++) {
			for(int k = 0;k<=i;k++) {
			  System.out.print(" ");
			}
			for(int j = 4;j>i;j--) {
			  System.out.print("0");
			}
			for(int m = 3;m>i;m--) {
				System.out.print("1");
			}
			System.out.println();
		}

	}

}
