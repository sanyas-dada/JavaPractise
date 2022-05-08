package indexRelatedStuff;

public class Main {
	public static void main(String[] args) {
		String dada = "sa-nyas";
		int index = dada.indexOf("-");
	
		int firstOccurenceofa = dada.indexOf("a");
		System.out.println(firstOccurenceofa);
		System.out.println("index of the occurence of - character in the `sa-nyas`:" +index);
		String phoneNumber = "981245325";
		boolean starts = phoneNumber.startsWith("98124");

		if (starts) {
			System.out.println("i feeling good");
			System.out.println("i feeling good today");
			System.out.println("Today is a going to be a great day");
		}else {
			System.out.println("this number is not started with the specified number");
		}
		if (index == -1) {
			System.out.println("this character is not avaliable in the name of the string is dada");
		} else {
			System.out.println("this characters avaliable in the name of the string is dada");
		}

		String number = "9=77=89783=3738";
		String[] split2 = number.split("77=", 3);
		for (String name3 : split2) {
			System.out.println(name3);
		}
		String[] split = number.split("=");
		for (String name1 : split) {
			System.out.println(name1);
		}

	}
}
