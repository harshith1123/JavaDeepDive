package com.multithreading;

class Writing{
	public static final String resource1="PEN";
	public static final String resource2="PAPER";
}

class PenThread extends Thread{
	public void run() {
		synchronized(Writing.resource1) {
			System.out.println("Acquired the lock of pen. Waiting for paper");
			synchronized(Writing.resource2) {
				System.out.println("Task completed by PenThread");
			}
		}
	}
}
class PaperThread extends Thread{
	public void run() {
		synchronized(Writing.resource1) {
			System.out.println("Acquired the lock of paper. Waiting for pen");
			synchronized(Writing.resource2) {
				System.out.println("Task completed by PaperThread");
			}
		}
	}
}

public class Test13 {

	public static void main(String[] args) throws InterruptedException {
		PenThread p1 = new PenThread();
		PaperThread p2 = new PaperThread();
		p1.start();
//		p1.join();
		p2.start();
//		p2.join();
	}

}
