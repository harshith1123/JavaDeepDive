package com.exception_handling;

//class CustomException extends Exception{}
class CustomException extends RuntimeException{}

public class Test16 {
	
	public static void m1() {
//		try {
//			throw new CustomException();
//		}catch(CustomException e) {
//			e.printStackTrace();
//		}
		throw new CustomException();
	}

	public static void main(String[] args) {
		m1();

	}

}
