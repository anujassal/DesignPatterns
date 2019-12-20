package com.multithreading;

public class WaitNotifyTest {
	
	public static void main(String[] args){
		Message msg = new Message("process it");
		Waiter waiter = new Waiter(msg);
		new Thread(waiter,"waiter").start();
		
		Waiter anotherWaiter = new Waiter(msg);
		new Thread(anotherWaiter,"anotherWaiter").start();
		
		Notifier notifier = new Notifier(msg);
		new Thread(notifier,"Notifier").start();
		System.out.println("All thread are started");
	}

}
