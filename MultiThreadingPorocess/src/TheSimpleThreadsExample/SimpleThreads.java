package TheSimpleThreadsExample;

public class SimpleThreads {
	// Display a message,  preceded by the name of the current Thread
	static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();
	 	System.out.format("%s: %s%n",threadName,message);
	}
	private static class MessageLoop implements Runnable{

		@Override
		public void run() {
			String important[] = {
					"Mares eat oats",
					"Does eat oats",
					"Little lambs eat ivy",
					"A kid will eat ivy too"
			};
			try {
				for(int i=0;i<important.length;i++) {
					//Pauses for 4 seconds
					Thread.sleep(4000);
					// Print a message
					threadMessage(important[i]);
				}
				
			}catch(InterruptedException e) {
				threadMessage("I wasn't done!");
			}
			
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		//Delay, in milliseconds before 
		// We interrupt MessageLoop
		// Thread default one hour)
		Thread t = new Thread(new MessageLoop());
		t.start();
	 // wait this thread to be died.
		t.join();
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		System.out.println("Thread is terminated");
		
		

	}

}
