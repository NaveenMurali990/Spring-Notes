package com.thread;


class Demo12 extends Thread{
	
	 @Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("UserThread executing ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Demo22 extends Thread{
	
	 @Override
	public void run() {
		for(;;) {
			System.out.println("DThread executing ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}









public class BookDeamon {

	public static void main(String[] args) {
		
		Demo12 d12=new Demo12();
		Demo22  d22=new Demo22();
		d22.setDaemon(true);
		d12.start();
		d22.start();
	}
}
