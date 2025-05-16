package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test15 implements Runnable{

	public static void main(String[] args) {
//		Executor executor = Executors.newSingleThreadExecutor();  // will create only single thread
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new Test15());
		executor.shutdown();
	
	}

	@Override
	public void run() {
		System.out.println("task completed...");
		
	}

}
