package graphics;

public class TextDrawing {

	public static void main(String[] args) {
		String[] string = { "flower", "flow", "flighter" };
		string[0] = "flower";
		for (int i = 0; i < string[0].length(); i++) {
			char charAt = string[0].charAt(i);
			System.out.println(charAt);
		}
		string[1] = "flow";
		string[2] = "flighter";
		boolean startsWith = string[1].startsWith("flow");
		if (startsWith) {
			System.out.println("I am going to find out the solution anyways.");
		} else {
			System.out.println("i think differentWay");
		}

		boolean endsWith = string[0].endsWith("er");
		if (endsWith) {
			System.out.println("i am going to find out the sloution anyways .no matter how many hours it take");
		} else {
			System.out.println("I am trying to give my the best of the best of the best version of myseld");
		}
		/*
		 * // int compareTo = string[0].compareTo(string[1]); if(string.length<=200) {
		 * for(int i = 0;i<string.length;i++) { if(string[i].length()<=200) {
		 * //string[i].charAt(i)
		 * 
		 * } }
		 * 
		 * } if(string.length==0) {
		 * System.out.println("there is no string to test out"); } }
		 */

	}
}
