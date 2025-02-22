package com.thread;
class demo111 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
}
public class PracticeMawa {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		demo111 d = new demo111();
		d.setName("Naveen");
		d.start();
		
		System.out.println(Thread.currentThread());
	}

}
