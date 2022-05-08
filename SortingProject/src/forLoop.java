
public class forLoop {
	
	public static void main(String[] args) {
	    
	     
	     for(int i = 0;i<10;++i) {
	    	System.out.println(i);
	 		if(i == 6) {
	 			System.out.println("i am done");
	 			break;
	 		}
	 		System.out.println("What am i thinking right now??/");
	 		
	 	}
	     
	     System.out.println("_______^^^^^^___^^^");
	 	for(int i = 0;i<5;i++) {
	 		if(i/3 == 0) {
	 			continue;
	 		}
	 		System.out.println(i);
	 		System.out.println("i am feeling good");
	 		
	 	}
	 	
	 	
	 	int i = 9 ; 
	 	while(i>5) {
	 		System.out.println("The value of i is "+i);
	 	    i--;
	 	}
	 	System.out.println("i do my best of the best version of myself ");
	 	System.out.println("i am trying to solve the new ways!!!");
	 	 
		/// I think when we use the breaks condition,
	 	// the loop is terminated completey if this condition is meet
	 	// in contrast to continue,
	 	// when the condition meets , then goes to the next 
	 	// loop that it, in opposite if the condition doesn't meet the criteria
	 	// the continue loop , other statements is not executed.
	 	
	}
	
   

}
