package com.exception_handling;

public class Test7 {
	public static void m1() {
		try {
			int result = 12/0;
			
		}
		
		catch(NullPointerException e) {
			System.out.println("Exception handled");
		}
		System.out.println("after try-catch");
	}

	public static void main(String[] args) {
		m1();

	}

}
