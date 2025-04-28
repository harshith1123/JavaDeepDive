package com.exception_handling;

public class Test10 {
	
	public static void m1() {
		try {
			int result = 12/0;			
		}catch(NullPointerException e) {
			System.out.println("Exception handled by 1st catch");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled by 2nd catch");
		}
		catch(NumberFormatException e) {
			System.out.println("Exception handled by 3rd catch");
		}
	}
	public static void m2() {
		try {
			int result = 12/0;			
		}catch(Exception e) {
			System.out.println("Exception handled by 1st catch");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled by 2nd catch");
		}
		catch(NumberFormatException e) {
			System.out.println("Exception handled by 3rd catch");
		}
	}
	public static void main(String[] args) {
		m1();

	}

}
