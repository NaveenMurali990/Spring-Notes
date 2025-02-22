package com.thread;
class Queue1{
	private int data;
	public void setData(int data) {
		this.data=data;
		System.out.println("The Producer produced :"+ data);
	}
	public void getdata() {
		System.out.println("Consumer consumed :"+ data);
	}
}
class Producer1 extends Thread{
	private Queue1 q;
	
	public Producer1(Queue1 q) {
		
		this.q = q;
	}

	@Override
	public void run() {
		int i=0;
		for(;;) {
			q.setData(i++);
		}
	}
}
class Consumer1 extends Thread{
	private Queue1 q;
public Consumer1(Queue1 q) {
		
		this.q = q;
	}
	@Override
	public void run() {
		for(;;) {
			q.getdata();
		}
	}
}
public class ProducerConsumerPrblem {
	public static void main(String[] args) {
		 Queue1 q = new Queue1();
		  Producer1 p = new Producer1(q);
		  p.setName("Producer");
		   Consumer1 c = new Consumer1(q);
		   c.setName("Consumer");
		 
         p.start();
         c.start();
	}
}
