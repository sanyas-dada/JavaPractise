package com.sanyasdada.express.livelock.atomicvariable;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private AtomicInteger value = new AtomicInteger();
	public  void increment() {
		value.incrementAndGet();
		System.out.println("I never ever sleep in the at noon");
		
	}
	public  void decrement() {
		value.decrementAndGet();
	}
	public  int get() {
		return value.get();
	}

}
