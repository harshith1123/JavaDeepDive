package com.multithreading;

// 2. Implementing Runnable interface
class B implements Runnable {
	public void m1() {
		System.out.println("m1() method executed by : " + Thread.currentThread().getName());
	}

	public void run() {
		m1();
	}
}

public class Test4 {
	public static void main(String[] args) {
		B t1 = new B();
		Thread t = new Thread(t1);
		t.start();
	}
}
