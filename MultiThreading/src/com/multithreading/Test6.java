package com.multithreading;

class A1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Current Running Thread:" + Thread.currentThread().getName() + " - " + i);
		}
	}
}

public class Test6 {
	public static void main(String[] args) {
		A1 t = new A1();
		A1 t2 = new A1();
		
		t.setName("A");
		t2.setName("B");
		t.start();
		t2.start();
	}
}
