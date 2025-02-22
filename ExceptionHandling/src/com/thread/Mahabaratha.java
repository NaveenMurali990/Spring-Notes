package com.thread;
class Warrior extends Thread{
	String res1="Bramhastra";
	String res2="pashupatras";
	String res3="sarpasthar";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Arjuna")) {
			Arjuna();
		}
		else {
			Karna();
		}
	}
	public void Arjuna() {
		
		
		try {
		
		Thread.sleep(5000);
		synchronized(res1) {
			System.out.println("Arjuna acquries Bramhastra");
			Thread.sleep(5000);
			synchronized (res2) {
				System.out.println("Arjuna acquries pashupatras");
				Thread.sleep(5000);
				synchronized (res3) {
                  System.out.println("Arjuna acquires sarpasthra");					
				}
				
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void Karna(){
		try {
			
			Thread.sleep(5000);
			synchronized(res1) {
				System.out.println("Karna acquries Bramhastra");
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Karna acquries pashupatras");
					Thread.sleep(5000);
					synchronized (res3) {
	                  System.out.println("Karna acquires sarpasthra");					
					}
					
				}
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
	}
}
public class Mahabaratha {

	public static void main(String[] args) {
	 Warrior w1 = new Warrior();
	 w1.setName("Arjuna");
	 Warrior w2 = new Warrior();
	 w2.setName("Karna");
	 w1.start();
	 w2.start();
	 

	}

}
