package leetcodeproblem;

public class CheckingPalindromeString {
	public static boolean CheckingPalindromeSubstring(String s) {
		if(s.isEmpty()) 
			System.out.println("String is empty. Try to give me new String");
		 int n = s.length();
	       char []revString = new char[n];
	       
	       for(int i = 0; i<=s.length()/2;i++) {
	    	   revString[n-1] = s.charAt(i);
	    	   revString[i] = s.charAt(n-1);
	    	   n--;   
	       }
	       String s1 = new String(revString);
	       if(s1.equals(s)) return true;
		   return false;
	}

	public static void main(String[] args) {
		boolean ok = CheckingPalindromeSubstring("sanas");
		if(ok) {
			System.out.println("Given String is the Palindrome String");
		}else {
			System.out.println("Given String isnot the Palindrome String");
			
		}
		
	}

}
