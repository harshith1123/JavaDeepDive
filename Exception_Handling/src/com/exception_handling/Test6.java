package com.exception_handling;

public class Test6 {
	
	public static void m1() {
		try {
			int result = 12/0;
			String str = null;
			int length = str.length();
		}catch(Exception e) {
			System.out.println(e+" is handled");
		}
	}

	public static void main(String[] args) {
		m1();

	}

}
