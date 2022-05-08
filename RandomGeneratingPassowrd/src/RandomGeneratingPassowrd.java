import java.util.Random;

public class RandomGeneratingPassowrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int length = 10;
             System.out.println(sanyas_Passowrd(length));
	}

	private static char[] sanyas_Passowrd(int len) {
		// TODO Auto-generated method stub
		System.out.println("Generating password using random(): ");
		System.out.println("Your new password is :");
		
		String Capital_chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqurstuvwxyz";
		String numbers = "0123456789";
		String symbols = " !@#$%^&*_=+-/.?<>[] {}";
        String values = Capital_chars +Small_chars +numbers +symbols;
		
        Random rndm_method = new Random();
        char[] password = new char[len];
        for( int i = 0;i<len;i++) {
        	password[i] = values.charAt(rndm_method.nextInt(values.length()));
        }
        
		return password;
	}

}
