package com.app.deadlock;

public class Devideopp implements Runnable{
 A a;
 B b;
	
 public Devideopp(A a, B b) {
	 this.a=a;
	 this.b=b;
 }
	public void run() {
	 synchronized (b) { 
		 System.out.println(" i am in devide opp");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("i am waiting for obj A");
		 synchronized (a) {
			
		}
		
	}
 }
}
