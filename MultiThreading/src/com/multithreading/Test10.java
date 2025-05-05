package com.multithreading;

class SharedResource {
	static int counter = 0;

	public synchronized void incrementCounter() {
		this.counter++;
//		giving different output is because that counter is not atomic operator means there is three operation first it is loading initial
//		value to the memory than incrementing it than assigning the value and there is possibility that thread could do only operation among that
//		so that's y we used synchronized to complete entire task before going to next at that time lock concept will applied to the object.
		
	}
}

public class Test10 {
	public static void main(String[] args) throws InterruptedException {
		SharedResource sr = new SharedResource();
		
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					sr.incrementCounter();					
				}
//				System.out.println(sr.counter);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					sr.incrementCounter();				
				}
//				System.out.println(sr.counter);
			}
		};

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("The final value of counter:" + SharedResource.counter);
	}
}
