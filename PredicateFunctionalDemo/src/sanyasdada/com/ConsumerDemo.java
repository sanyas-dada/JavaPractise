package sanyasdada.com;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {

		// Example of Conusmer Interface:take any object and save its details in
		// Database and don't return anything.
		ConsumerDemo demo = new ConsumerDemo();
		demo.squareInt(5);
		Consumer<Integer> consume = i -> System.out.println("Taking an input and performing operation: " +i*i);
		consume.accept(5);

	}

	private void squareInt(int i) {
		// TODO Auto-generated method stub
		int squared = i * i;
		System.out.println(squared);
	}
}
