 package com.thread;
class Queue{
	private int data;
	boolean isDataMember=false;
	public synchronized void setData(int data) {
		if(isDataMember==false) {
			this.data=data;
			System.out.println("Producer produces data"+ data);
			isDataMember=true;
			notify();
			
			}
		else {
			try {
				wait();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	 public synchronized void  getData() {
		if(isDataMember==true) {
		System.out.println(" consumer consumes data: "+data);
		isDataMember=false;
		notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
		 
}
	 
class Producer extends Thread{
	  Queue q;
	  public Producer(Queue q) {
		  this.q=q;
	
	  }
	  
	 @Override
	public void run() {
		int i=1;
		for(; ;) {
			q.setData(i++);
		}
	}
}
class Consumer extends Thread{
	Queue q;
	Consumer(Queue q){
		this.q=q;
	}
	@Override
	public void run() {
	    for(;;) {
	    	q.getData();
	    }
	}
}
public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		 Queue q = new Queue();
		  Producer p = new Producer(q);
		  p.setName("Producer");
		   Consumer c = new Consumer(q);
		   c.setName("Consumer");
		 
          p.start();
          c.start();
	}

}

