package www.timer.com;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
//     Timer = a facility for threads to schedule tasks for future execution in a background thread
//	   TimerTask =  A task that can be scheduled for one-time or repeated execution by a timer.
		
		
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;

			@Override
			public void run() {
                  if(counter>0) {
                	  System.out.println(counter +" seconds");
                	  counter--;
                  }else {
                	  System.out.println("HAPPY NEW YEAR");
                	  timer.cancel();
                  }
			}
			
		};
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2021);
		date.set(Calendar.MONTH,Calendar.OCTOBER);
		date.set(Calendar.DAY_OF_MONTH,31);
		date.set(Calendar.HOUR,3);
		date.set(Calendar.MINUTE,36);
		date.set(Calendar.SECOND,59);
		date.set(Calendar.MILLISECOND,0);
		
		
//		timer.schedule(task, 2000);
//		timer.schedule(task,date.getTime());
        timer.scheduleAtFixedRate(task,date.getTime(), 1000);	
		
		
		
		
		// Schedule the specific task for execution after the specified time.
//		timer.schedule(task, 2000);
	}

}
