package com.thread;


class Queue12{
	private int data;
	boolean isDataMember=false;
	public synchronized void setData(int data) {
		try {
			this.data=data;
			System.out.println("Producer produces data"+ data);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
			}
	 public synchronized void  getData() {
		
		System.out.println(" consumer consumes data: "+data);
	
	}
		 
}
	 
class Producer123 extends Thread{
	  Queue12 q;
	  public Producer123(Queue12 q) {
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
class Consumer123 extends Thread{
	Queue12 q;
	Consumer123(Queue12 q){
		this.q=q;
	}
	@Override
	public void run() {
	    for(;;) {
	    	q.getData();
	    }
	}
}
public class Problem {
	public static void main(String[] args) {
		 Queue12 q = new Queue12();
		  Producer123 p = new Producer123(q);
		  p.setName("Producer");
		   Consumer123 c = new Consumer123(q);
		   c.setName("Consumer");
		 
        p.start();
        c.start();
	}
}
