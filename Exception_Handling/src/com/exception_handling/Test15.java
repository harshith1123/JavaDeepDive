package com.exception_handling;

public class Test15 {
	public static void m1(int a,int b) {
		try {
			System.out.println(a/b);
			System.exit(0);
			return;
		}catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("finally block executed");
		}
	}

	public static void main(String[] args) {
		m1(12,4);

	}

}
