package calculator.com;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "36.758";
		String name2 = "Sanyasdada" + ":";
		String name3 = "bibash";
		for (int i = 0; i < name3.length() - 1; i++) {
			System.out.print(name3.charAt(i));
		}
		System.out.println();
		System.out.println(name3.length() - 1);
		String rollNo = "37893893";
		int number = 10;
		double d = 30.897;
		String intToString = String.valueOf(number);
		System.out.println(intToString);

		String doubleToString = String.valueOf(d);
		System.out.println(doubleToString);

		double stringToDouble = Double.parseDouble(name);
		System.out.println(stringToDouble);

		int stringToInt = Integer.parseInt(rollNo);
		System.out.println(stringToInt);

		System.out.println("");
		System.out.println("rock and roll sanyas dada");
		System.out.println(name2.concat(String.valueOf(number)));

		String working = " i am doing my best of the best version of myself";
		String notWorking = "I am good at coding but try give my  best everyday";
		System.out.println(notWorking);
		System.out.println(working);
	}

}
