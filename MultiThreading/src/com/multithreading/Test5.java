package com.multithreading;

class C extends Thread {
	public void run() {
		System.out.println("Task Completed");
	}
}

public class Test5 {
	public static void main(String[] args) {
		C t = new C();
		t.start();
	}
}