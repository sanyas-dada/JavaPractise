package delayedQueue;

import java.util.Random;
import java.util.concurrent.DelayQueue;

class Producer extends Thread{
	private DelayQueue<DelayTask> queue;
	private static int taskCount;
	
	public Producer(DelayQueue<DelayTask> queue) {
		this.queue = queue;
	}
	public void run() {
		while(true) {
			queue.put(produce());
		}
	}
	private DelayTask produce() {
		String taskName = "Task" +(++taskCount);
		long delayTime = new Random().nextInt(10000);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(getName() + ": produced" +taskName);
		return new DelayTask(taskName,delayTime);
		
	}
	
}
class Consumer extends Thread{
	private DelayQueue<DelayTask> queue;
	//private static int taskCount;
	public Consumer(DelayQueue<DelayTask> queue) {
		this.queue = queue;
	}
	
	public void run() {
		while(true) {
			try {
				DelayTask task = queue.take();
				consume(task);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	private void consume(DelayTask task) {
		System.out.println(getName() + ": prepare to process " +task);
		task.run();
	}
}



public class DelayQueueTest {
	static int CONSUMER_THREADS = 3;

	public static void main(String[] args) {
		DelayQueue<DelayTask> queueTasks = new DelayQueue<>();
		
		Producer producer = new Producer(queueTasks);
		producer.start();
		Consumer[] consumers = new Consumer[CONSUMER_THREADS];
		
		for(int i = 0; i<CONSUMER_THREADS;i++) {
			consumers[0] = new Consumer(queueTasks);
			consumers[0].start();
		}
		

	}

}
