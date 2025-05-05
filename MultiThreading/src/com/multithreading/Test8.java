package com.multithreading;

public class Test8 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Strarted");
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i < 20; i++) {
					continue;
				}
				System.out.println("Thread 1 completed");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i < 20; i++) {
					continue;
				}
				System.out.println("Thread 2 completed");
			}
		};
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Main completed");
	}
}
