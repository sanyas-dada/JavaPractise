package com.sanyasdada.thread.firstclass;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) { // TODO
				System.out.println("I am felling god, but i interrupted");
				continue;
			}

		}

	}
}

public class FirstThreadClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable r1 = new MyThread();
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			System.out.println(Thread.currentThread().getName());
			System.out.println(" i am gong to get a job in this month by doing some prouket my");

			Thread.sleep(5000);
			t1.interrupt();
		} catch (InterruptedException ex) {

		}

		// println("I'm " + Thread.currentThread().getName());
		// Join () method in thread
		// This statement causes the current thread to wait
		// for the Thread t1 to complete before it continues.
	}

}
