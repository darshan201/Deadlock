package com.app.deadlock;

public class Practice {

	public static void main(String[] args) {
		System.out.println("process Start");
		
		A a = new A();
		B b = new B();
		
		
		Runnable devideOpp =new Devideopp(a,b);
		Runnable  sumOpp=new Sumopp(a, b);
		
		Thread t1 = new Thread(devideOpp);
		Thread t2 = new Thread(sumOpp); 
		t1.start();
		t2.start();
		
		while(t1.isAlive()) {
			
		}
		System.out.println("ENd");

	}

}
