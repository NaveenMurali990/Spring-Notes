package com.thread;
class Printer implements Runnable{
	@Override
	public void run() {
		
		try {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+"  is Printing");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"  is Compelted");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class prin {
public static void main(String[] args) {
	 Printer p=new  Printer();
	 
	 Thread t1 =new Thread(p);
	 Thread t2 =new Thread(p);
	 Thread t3 =new Thread(p);
             t1.setName("Boy");
             t2.setName("girl");
             t3.setName("Uncle");
             t1.start();
             t2.start();
             t3.start();
}
	
}
