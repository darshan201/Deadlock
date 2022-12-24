package com.app.deadlock;

public class Sumopp implements Runnable{
	 
	 A a;
	 B b;
		
	 public Sumopp(A a, B b) {
		 this.a=a;
		 this.b=b;
	 }
	
	public void run() {
		 
		synchronized (a) {
			 System.out.println(" i am in Sum opp");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("i am waiting for obj B");
			synchronized (b) {
				System.out.println("in B");
			}
		}
	 }
}
