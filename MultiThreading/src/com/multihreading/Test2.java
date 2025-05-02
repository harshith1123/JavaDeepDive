package com.multihreading;

public class Test2 {
	
	public void m1() {  
		System.out.println("m1() method executed by :"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		new Test2().m1();

	}

}
