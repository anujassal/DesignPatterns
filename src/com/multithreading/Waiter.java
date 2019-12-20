package com.multithreading;

public class Waiter implements Runnable {
	
	private Message msg;
	
	public Waiter(Message message){
		this.msg = message;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized(msg){
			try{
				System.out.println(name + " Waiting to get notified at time " +
			System.currentTimeMillis());
				msg.wait();
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println(name + " Waiter thread got notified at time " +
					System.currentTimeMillis());
			System.out.println(name + " processed " +
					msg.getMessage());
		}

	}

}
