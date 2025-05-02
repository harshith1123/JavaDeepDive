package com.multihreading;

class C extends Thread{
	public void run() {
		System.out.println("Task completed");
	}
}

public class Test5 {
	public static void main(String[] args) {
		C t1 = new C();
		t1.start();
		t1.start();
	}
	
			
			
}
