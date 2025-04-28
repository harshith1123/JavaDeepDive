package com.exception_handling;

public class Test4 {

	public static void m1() {
		try {
			System.out.println("stat1");
			System.out.println("stat2");
			System.out.println(12/0);
//			System.out.println("stat3");
		}
		catch(Exception e) {
			System.out.println("Exception handled in catch block");
		}
		System.out.println("stat3");
	}
	public static void main(String[] args) {
		m1();

	}

}
