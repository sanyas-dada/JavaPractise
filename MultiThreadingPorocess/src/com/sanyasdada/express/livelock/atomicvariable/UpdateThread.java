package com.sanyasdada.express.livelock.atomicvariable;

public class UpdateThread extends Thread {
   private Counter counter;
   public UpdateThread(Counter counter) {
	   this.counter = counter;
	   System.out.println("i am going to get a job at the end of the month ");
   }
   
   public void run() {
	   try {
		   System.out.println(" I am improving day by day my problems solving skill");
		   System.out.println("Feeling good kanchha");
		   Thread.sleep(5000);
		   
	   }catch (InterruptedException ex ) {
		   ex.printStackTrace();
	   }
	   counter.increment();
   }
}
