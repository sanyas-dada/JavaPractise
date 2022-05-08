package delayedQueue;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayTask implements Delayed {
	private String name;
	private long delayTime;

	public DelayTask(String name, long delayTime) {
		this.name = name;
		this.delayTime = delayTime;
	}

	@Override
	public int compareTo(Delayed another) {
		DelayTask anotherTask = (DelayTask) another;
		if (this.delayTime < anotherTask.delayTime) {
			return -1;
		}
		if (this.delayTime > anotherTask.delayTime) {
			return 1;
		}

		return 0;

	}

	@Override
	public long getDelay(TimeUnit timeUnit) {
		long difference = delayTime - System.currentTimeMillis();
		return timeUnit.convert(difference, TimeUnit.MILLISECONDS);

	}

	public void run() {
		long executionTime = new Random().nextInt(100000);
		try {
			Thread.sleep(executionTime);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Task " + name + "has been done.");

	}

	public String toString() {
		return this.name;
	}

}

class DelayedQueueExample {

	public static void main(String[] args) {
		DelayQueue<DelayTask> queue = new DelayQueue<>();
		DelayTask task1 = new DelayTask("Learn Andriod dev.", 20_000);
		DelayTask task2 = new DelayTask("Coding daily", 100_000);
		DelayTask task3 = new DelayTask("Do Project", 200_000);

		queue.put(task1);
		queue.put(task2);
		queue.put(task3);

		DelayTask task = queue.poll();
		if (task != null) {
			System.out.println("Process :" + task);

		} else {
			System.out.println("Queue is empty");
		}

	}

}
