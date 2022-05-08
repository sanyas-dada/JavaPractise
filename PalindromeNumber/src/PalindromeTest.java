public class PalindromeTest {
	
	static boolean isFirstTimeRunning = false;
	static int backPressed;
    static boolean doubleback = false;

	public static void main(String[] args) {
		
		if(backPressed ==0) {
			System.out.println("i am pressing th back button one time");
			backPressed++;
		}
	

		if(doubleback) {
			System.out.println("I AM THE BACK BUTTON");
			System.out.println("I am on the right track");
			return ;
		}
		 doubleback = true;
		System.out.println(" i am on the back track");
		new Runnable() {
			
			@Override
			public void run() {
				doubleback = false;
				
			}

			
		};
		
		/*
		 * double pow = -Math.pow(2,31); System.out.println(pow);
		 * 
		 * 
		 * 
		 * int x = -120 ; int original = x; int reversedNumber=0,rem; while(x>0 || x<0)
		 * { rem = x%10; reversedNumber = reversedNumber * 10 + rem; x = x/10; }
		 * System.out.println(reversedNumber); if(original == reversedNumber) {
		 * System.out.println("This is a palindrome number"); }else {
		 * System.out.println("This is a reversedNumber"); }
		 */
		// form today onward what i conclude is that either a given number is equal to
		// reversedNumber
		// then it is called palindrome number or this number is reversed's of the

		// original numbers.
	

		// checking the array contains zero or not
		// if array contains zero it return YES ,otherwise return null;
		//int[] a11 = null;

		//String YesOrNo = checkingNumber(a11);
		//System.out.println(YesOrNo);

		/*
		 * int[] array = { 1,3,10,4,5};
		 * 
		 * for(int i11=0;i11<array.length;i11++) { if(array[i11] >0) { int remainder =
		 * array[i11]%10; if(remainder == 0) { return YES; } }else {
		 * 
		 * } }
		 */
		if(isFirstTimeRunning) {
			dataFromServer();
		}else {
			System.out.println("i really really wanna change my lifestndaras");
			isFirstTimeRunning = true;
		}
		
		if(isFirstTimeRunning) {
			System.out.println("i am getting better and better every single day");
		}
		
		

	}

	private static void dataFromServer() {
		// TODO Auto-generated method stub
	   System.out.println("i am getting better and better");
	  
		
	}

	/*
	 * private static String checkingNumber(int[] a11) { String yesorno="YESorNO";
	 * String yes = "YES"; String no = "NO"; int n1 = a11.length; for(int i11 = 0;
	 * i11 < n1; i11++) { int n = a11[i11]; if (n == 0) { return "YES"; }else {
	 * while (n > 0) { int remainder = a11[i11] % 10; if (remainder == 0) { return
	 * "YES";
	 * 
	 * } n = n / 10; } return "NO"; } }
	 * 
	 * 
	 * }
	 */

}
