package com.multithreading;

public class Test2 {
	public void m1() {
		System.out.println("m1() executed by " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		new Test2().m1();
	}
}
// the stack and the pc register is a non sharable resource every thread is maintaining its own 