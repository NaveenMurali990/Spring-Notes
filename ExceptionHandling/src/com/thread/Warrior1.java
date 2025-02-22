package com.thread;

class W extends Thread {
 private String res1="Bramhaatra";
 private String res2="shrapahaatra";
 private String res3="pashupatsatra";
 
 @Override
	public void run() {
		if(Thread.currentThread().getName().equals("Arjuna")) {
			Arjuna();
		}
		
		else {
			karna();
		}
	}
 
 public void Arjuna() {
	 try {
		
		 Thread.sleep(1000);
		 synchronized (res3) {
			System.out.println("Arjuna aquired pashupatsatra");
			Thread.sleep(1000);
			synchronized (res2) {
				System.out.println("Arjuna aquired shrapahaatra");
				Thread.sleep(1000);
				synchronized (res1) {
					System.out.println("Arjuna aquired Bramhaatra "+res3);
				}
			}
			
		}
		 
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
   public void karna() {
	   try {
			
			 Thread.sleep(1000);
			 synchronized (res1) {
				System.out.println("karna  aquired Bramhaatra ");
				Thread.sleep(1000);
				synchronized (res2) {
					System.out.println("karna aquired shrapahaatra");
					Thread.sleep(1000);
					synchronized (res3) {
						System.out.println("karna aquired pashupatsatra");
					}
				}
				
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
   }
}
public class Warrior1  {
	
	public static void main(String[] args) {
		W w1=new W();
		W w2=new W();
		w1.setName("Arjuna");;
		w2.setName("Karna");
		w1.start();
		w2.start();
	}
	
}