
public class NegativeReversedNumber {
	public static int reverse(int x) {
	       double p =  Math.pow(2,31);
	       if (x==0 || x < -p || x> p-1 ) return 0;
	       int reversedNumber = 0,rem;
	        while(x>0 || x<0){
	            rem = x%10;
	            reversedNumber = reversedNumber * 10 + rem;
	            x = x/10;
	        }
	        return reversedNumber;  
	    
	    
	    }
	      

	public static void main(String[] args) {
        int reversedNumber2 = reverse(-2147483648);
		int reversedNumber3 = reverse(2147483647);
		System.out.println(reversedNumber3);
		System.out.println(reversedNumber2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("Integer ranges from:"+Integer.MIN_VALUE +" to "+Integer.MAX_VALUE);
		

	}

	
	
	
	// Given a signed 32-bit integer x, return x with its digits reversed. 
	// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
	// then return 0.
}
