package com.exception_handling;

class InterruptedException extends Exception{
	public void getMsg() {
		System.out.println("Exception handled successfully");
	}
}
public class Test18 {
	public static void m1() throws InterruptedException {
		throw new InterruptedException();
	}

	public static void main(String[] args) throws InterruptedException {
//		m1();
		try {
			m1();
		}catch(InterruptedException e) {
			e.getMsg();
		}
		

	}

}
