package com.sanyasdada.thread.firstclass;

public class DaemonThread {
	public static void main(String[] args) {
		Thread userThread = new Thread(new Runnable() {
			public void run() {
				int x = 5;
				while (x > 0) {
					System.out.println("User thread: " + x--);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						System.out.println("i am feeling good.but,i am interrupted");
					}
				}
			}

		});
		userThread.start();
		Thread daemonThread = new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println("Daemon Thread is running...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
						System.out.println("i am not interrputed");
					}
				} 
			}

		});
		
		// java  virtual machine exists only when only running thread are all daemon threads
      // running thread  are daemon thread
	    daemonThread.setDaemon(true);
		daemonThread.start();

	}

}
