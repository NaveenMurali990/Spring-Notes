package com.thread;
class Warriors1  extends Thread{
	String res1="Brahmastra";
	String res2="pasupastra";
	String res3="sarpastra";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("karna")) {
			karna();
		}
		else {
			Arjuna();
		}
	}
	public  void Arjuna() {
		try {
		Thread.sleep(5000);
		synchronized(res1) {
		System.out.println("Arjuna acquires bramhastra");
		Thread.sleep(5000);
		synchronized (res2) {
			System.out.println("Arjuna acquires pasupastra");
			Thread.sleep(5000);
			synchronized (res3) {
				System.out.println("Arjuna acquires sarpastra");
			}
			
		}
		
	}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public  void karna() {
		try {
			Thread.sleep(5000);
			synchronized(res1) {
			System.out.println("karna acquires bramhastra");
			Thread.sleep(5000);
			synchronized (res2) {
				System.out.println("karna acquires pasupastra");
				Thread.sleep(5000);
				synchronized (res3) {
					System.out.println("karna acquires sarpastra");
				}
				
			}
			
		}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
public class Prac {

	public static void main(String[] args) {
		Warriors1 w1 = new Warriors1();
		w1.setName("Arjuna");
		Warriors1 w2 = new Warriors1();
		w2.setName("karna");
		w1.start();
		w2.start();
		

	}

}
