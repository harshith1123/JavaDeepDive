package com.multihreading;

// 2. Implementing Runnable Interface
class B implements Runnable{
	public void m1() {
		System.out.println("m1() method executed by :"+Thread.currentThread().getName());
	}
	public void run() {
		m1();
	}
}
public class Test4 {

	public static void main(String[] args) {
		B t1 = new B();
		Thread th = new Thread(t1);
		th.start();

	}

}
