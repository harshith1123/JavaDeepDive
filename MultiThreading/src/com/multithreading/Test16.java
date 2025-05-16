package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable{

	@Override
	public void run() {
		System.out.println("task1 completed by:"+Thread.currentThread().getName());
		
	}
	
}
class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("task2 completed by: "+Thread.currentThread().getName());
		
	}
	
}

public class Test16 {

	public static void main(String[] args) {
//		Single Thread with multiple task
//		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//		singleThreadExecutor.execute(new Task1());
//		singleThreadExecutor.execute(new Task2());
//		singleThreadExecutor.shutdown();
		
//		Multiple Thread with multiple task
		/*
		 * ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		 * newFixedThreadPool.execute(new Task1());
		 * newFixedThreadPool.execute(newTask2());
		 * newFixedThreadPool.shutdown();
		 */
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		newCachedThreadPool.execute(new Task1());
		newCachedThreadPool.execute(new Task2());
		newCachedThreadPool.shutdown();
	}

}
