package com.sanyasdada.thread.firstclass;

public class ThreadState {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Thread currentThread = Thread.currentThread();
				System.out.println( currentThread.getName()+ " i study smart way"+ currentThread.getState());
			}
		});
		t1.start();
	
	}

}
