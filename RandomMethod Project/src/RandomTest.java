import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		  int number = (int) (Math.random() * 10 +1);
		  
		  System.out.println(number); if(number >5 ) {
		  System.out.println("values is not correct"); }else if(number<5) {
		  System.out.println("values in correct"); }
		 
		 Random random  = new Random();
		 String numbers = "0123456789";
		 char[] ram = new char[5];
		 
			for (int i =0;i<5;i++) {
				ram[i] = numbers.charAt(random.nextInt(numbers.length()));
				System.out.println(ram);
				
			 
		 }
	}

}
