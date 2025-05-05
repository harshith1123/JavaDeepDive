package com.multithreading;

class Alphabet{
	public void print(int num) {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(num+" X "+i+" = "+(num*i));
			}
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
		}
	}
}
class D extends Thread{
	Alphabet t;
	D(Alphabet t){
		this.t = t;
	}
	
	public void run() {
		t.print(2);
	}
}

class E extends Thread{
	Alphabet t;
	E(Alphabet t){
		this.t = t;
	}
	
	public void run() {
		t.print(5);
	}
}

public class Test12 {

	public static void main(String[] args) {
		Alphabet a = new Alphabet();
		Alphabet a1 = new Alphabet();
		
		D d = new D(a);
		E e = new E(a);
//		E e = new E(a1);
		
		d.start();
		e.start();

	}

}
