package com.exception_handling;

public class Test8 {
	public static void m1() {
		int result = 12/0;
		try {
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("Exception handled");
		}
		
	}

	public static void main(String[] args) {
		m1();

	}

}
