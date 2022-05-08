package leetcodeproblem;

public class ReverseString {
	public String ReversedString(String s) {
		  int n = s.length();
	       char []revString = new char[n];
	       
	       for(int i = 0; i<=s.length()/2;i++) {
	    	   revString[n-1] = s.charAt(i);
	    	   revString[i] = s.charAt(n-1);
	    	   n--;   
	       }
	       String s1 = new String(revString);
	       return s1;
	       
	       
	}

	public static void main(String[] args) {
		ReverseString revString = new ReverseString();
	    String revString2 = revString.ReversedString("sanyadada");
		System.out.println(revString2);
		
		String s2 = "ifgeelingeel";
		String s3 = "eel";
		 int lastIndex = s2.lastIndexOf(s3);
		 int Of = s2.lastIndexOf("eel");
		 int lastIndexOf = s2.lastIndexOf(s3,16);
		 System.out.println(lastIndexOf);
		 System.out.println(Of);
		System.out.println(lastIndex); 
		// how to check the palindrome string 
		// tell me na idea about kanchha .. how to check the palindrome string
		// kanchha tell me na idea plzz kanchha tell me na some idea about that things
		// ok i am thinking about it i am thinking abut it
		// di am worringing about my problem ..
		// i try to give the best verson of yself ... i try to gve my the best of the best version of myself
		
      
	}

}
