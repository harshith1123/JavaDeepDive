package com.multithreading;

public class Test9 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started");
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i < 20; i++) {
					try {
						sleep(1000);
						System.out.println("1st Thread"+i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Thread 1 completed");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 21; i < 40; i++) {
					try {
						sleep(1000);
						System.out.println("2nd Thread"+i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Thread 2 completed");
			}
		};
		t1.start();
		t2.start();
		System.out.println("main completed");
	}
}
