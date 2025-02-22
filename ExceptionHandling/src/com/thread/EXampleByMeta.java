package com.thread;
class Counter{
	private int count=1;
	public synchronized void increment() {
		System.out.println(count++);
	}
	public synchronized void decrement() {
		  if(count > 0) { // Check if count is greater than 0
	            System.out.println("Decrementing: " + count--);
	        } else {
	            System.out.println("Cannot decrement below 0");
	        }

	}
}

class IncrementThread extends Thread{
	Counter c;
	public IncrementThread(Counter c) {
		this.c=c;
	}
	@Override
	public void run() {
		
		for(int i=1;i<=50;i++) {
			c.increment();
		}
	}
}
class DecrementThread extends Thread{
	Counter c;
	public DecrementThread(Counter c) {
		this.c=c;
	}
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			c.decrement();
		}
	}
}

public class EXampleByMeta {

	public static void main(String[] args) {
		 Counter c = new Counter ();
		  IncrementThread incre = new IncrementThread(c);
		  DecrementThread decrce = new DecrementThread(c);
                  incre.start();
                  decrce.start();
	}

}
