package com.multithreading;

class Table{
//	public synchronized void print(int num) {
//		for(int i=1;i<=10;i++) {
//			System.out.println(num+" X "+i+" = "+(num*i));
//		}
//	}
	public static synchronized void print(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}

class T extends Thread{
	Table t;
	T(Table t){
		this.t = t;
	}
	
	public void run() {
		t.print(2);
	}
}

class T3 extends Thread{
	Table t;
	T3(Table t){
		this.t = t;
	}
	
	public void run() {
		t.print(5);
	}
}

public class Test11 {
	public static void main(String[] args) {
		Table t = new Table();
		Table t2 = new Table();
		
		T th = new T(t);
//		T3 t3 = new T3(t);
		T3 t3 = new T3(t2);
		
		th.start();
		t3.start();
	}
}
