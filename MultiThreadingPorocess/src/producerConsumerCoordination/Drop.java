package producerConsumerCoordination;

public class Drop {
	// Message sent from producer to consumer
	private String message;
	
	// True if consumers should wait
	// for producer to send message,
	// false if producer should wait for consumer to retrive message.
	
	private boolean empty = true;
	public synchronized String take() {
		// Wait until message is available
		while(empty) {
			try {
				wait();
				
			}catch (InterruptedException e) {}
		}
		// toggle status.
		empty = true;
		//Notify producer that status has changed
		notifyAll();
		return message;
		
	}
	public synchronized void put(String message) {
		// Wait until message has been retrieved.
		while(!empty) {
			try {
				wait();
				
			}catch(InterruptedException e) {}
		}
		// toggle Status.
		empty = false;
		// Store message;
		this.message =message;
		// notify consumer that status has changed
		notifyAll();
	}
	

}
