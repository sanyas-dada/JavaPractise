package interThreadCommunication;

class Thread1 implements Runnable {
	int totalBalance = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread starts calculation for total balance");
			for (int i = 0; i <= 50; i++) {
				totalBalance = totalBalance + i;
			}
			System.out.println(totalBalance);
			System.out.println("chid thread gives notification call");
			this.notify();
		}

	}
}

public class InterCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new Thread1();
		Thread b = new Thread(r1);
		b.start();
		synchronized (b) {
			System.out.println("main thread calling wait() metod");
			b.wait();
			System.out.println("main thread got notification call");
			// System.out.println("total balance "+ b.totalBalance);
		}

	}

}
