package com.exception_handling;

public class Test1 {

	public static void m1() {
		System.out.println("statement 1");
//		System.out.println(12/0);
		String str =null;
		System.out.println(str.length());
		System.out.println("statement 3");
		System.out.println("statement 4");
	}
	public static void main(String[] args) {
		m1();

	}

}
