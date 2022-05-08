
package com.sanyasdada.collections.Queue.ConsumerExamplesUsingBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer2 implements Runnable {
	private BlockingQueue<Integer> queue;
	private String threadId;

	public Consumer2(BlockingQueue<Integer> queue) {
		this.queue = queue;

	}

	@Override
	public void run() {
		threadId = "Consumer-" + Thread.currentThread().getId();
		try {
			while (true) {
				Integer number = queue.take();

				if (number == null || number == -1) {
					break;
				}
				consume(number);
				Thread.sleep(1000);
			}
			System.out.println(threadId + "STOPPED.");

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	private void consume(Integer number) {
		System.out.println(threadId+": Consuming number <= " + number);

	}
}
