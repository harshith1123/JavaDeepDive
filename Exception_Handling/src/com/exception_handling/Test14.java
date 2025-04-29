package com.exception_handling;

public class Test14 {
	public static int m1(int a,int b) {
		try {
			return a/b;
		}catch(Exception e) {
			return -1;
		}finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		System.out.println(m1(12,3));
		System.out.println(m1(12,0));

	}

	
}
