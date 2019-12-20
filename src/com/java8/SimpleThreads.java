package com.java8;

public class SimpleThreads {
	
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName,message);
	}
	
	private static class MessageLoop implements Runnable {
		public void run(){
			String importantInfo[] = {"hello","how","are","you","?","I","am","good","how","about","yourself","?"};
			try{
				for(int i=0;i<importantInfo.length;i++){
					Thread.sleep(4000);
					threadMessage(importantInfo[i]);
				} 
			}catch(InterruptedException ex){
				threadMessage("I was not done");
			}
		}
	}
	
	public static void main(String[] args) 
			throws InterruptedException{
		
		long patience = 1000 * 60;
		if(args.length>0){
			try{
				patience = Long.parseLong(args[0])*1000;
			} catch(NumberFormatException nEx){
				System.err.println("Argument must be an integer");
				System.exit(1);
			}
		}
		threadMessage("Starting MessageLoop Thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		threadMessage("Waiting for messageLoop thread to finish");
		while(t.isAlive()){
			threadMessage("Still waiting...");
			t.join(1000);
			if(((System.currentTimeMillis()-startTime)>patience)&&t.isAlive()){
				threadMessage("Tired of Waiting!");
				t.interrupt();
				t.join();
			}
			
		}
		threadMessage("Finally!");
		
		
	}

}
