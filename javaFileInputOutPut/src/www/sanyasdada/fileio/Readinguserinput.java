package www.sanyasdada.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Readinguserinput {

	public static void main(String[] args) throws IOException {

		// Reading user's input using BufferedReader Class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");

		String name = reader.readLine();

		// In the above example, the readLine() method reads a line text from the
		// command line;

		System.out.println("Your name is: " + name);
		System.out.println();
		System.out.println("Enter your dream:");
		String name1 = reader.readLine();
		System.out.println("Your dream is:"+name1);

		// Advantages: the input is buffered for efficient reading.
		// Drawabacks:the wrapping code is hard to remember

		// Reading user's input using Scanner Class
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter your nationality: ");
		String nationality = scanner.nextLine();
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Enter your Job: ");
		String job = scanner.next();
		System.out.println("your age is:" +age+"\n"+"your nationlity is:"+nationality+"\n"+"I am currently searching for a job:"+job);

		// Advantages: 1.convenient methods for parsing
		// primitives(nextInt(),nextFloat(),... ) from the tokenixed input
		// 2.Regular expressions can be used to find tokens.
		// Drawbacks: The reading methods are not synchronized.

		// Reading User's input using Console Class
		/*
		 * Console console = System.console();
		 * 
		 * if (console == null) {
		 * System.out.println("No console: non-interactive mode!"); System.exit(0); }
		 * 
		 * System.out.println("Enter your username:"); String username =
		 * console.readLine(); System.out.println("Enter your password: "); char[]
		 * password = console.readPassword(); System.out.println("Thankk you!");
		 * System.out.println("Your username is: " + username);
		 * System.out.println("YOur password is: " + String.valueOf(password));
		 * 
		 * //using console with fromatted prompt String job =
		 * console.readLine("Enter your job:"); String passport =
		 * console.readLine("Enter your %d (th) passport number:" ,2);
		 * 
		 * System.out.println("YOUR job is: " +job);
		 * System.out.println("Your passport number is: " +passport);
		 */

	}

}
