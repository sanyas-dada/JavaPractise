import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
     int[] number = {3,8,2,4,6,7,1,23,45,67,32,22};
     for(int i = 0;i<number.length-1;i++) {
    	 for(int j=i;j<number.length-1;j++) {
    		 if(number[i] >number[j+1]) {
    			 int temp = number[i];
    			 number[i] = number[j+1];
    			 number[j+1] = temp;
    			 
    		 }
    	 }
     }
     for(int i = 0;i<number.length;i++) {
    	 System.out.println("Sorted Arrays:"+ number[i]);

     }
		System.out.println("i am feeling good and i do my best no matter what conditions occur to me");
	}

}
