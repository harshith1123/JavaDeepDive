package com.multithreading;

class PrintData {
	public void print(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
}

class T1 extends Thread {
	PrintData obj;

	T1(PrintData obj) {
		this.obj = obj;
	}

	public void run() {
		this.obj.print(2);
	}
}

class T2 extends Thread {
	PrintData obj;

	T2(PrintData obj) {
		this.obj = obj;
	}

	public void run() {
		this.obj.print(5);
	}
}

public class Test7 {
	public static void main(String[] args)  {
		PrintData data = new PrintData();
		T1 th = new T1(data);
		T2 th2 = new T2(data);

		th.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);

		th.start();
//		th.join();  // before th2 starts it will finish executed the caller thread
		th2.start();
//		th2.join();
	}
}