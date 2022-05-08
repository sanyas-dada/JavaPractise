package snakegame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ifElse {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int number = br.read();
		 int number = 2;
		if(number >=0 && number <= 10) {
			System.out.println( number);
		} else {
			System.out.println("input error");

		}
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String readLine = br1.readLine();
		if (readLine.length() <= 15) {
			System.out.println(readLine);
		} else {
			System.out.println("length of the string invalid");
		}

	}

}
