package com.thread;
class WashRoom{
	 public void bathroom12() {
		
		try {
			
			System.out.println(Thread.currentThread().getName()+"entered the Bathroom");
			Thread.sleep(3000);
			
			System.out.println(Thread.currentThread().getName()+"using the Bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"exited the Bathroom");
		} 
		
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Men extends Thread{
	private WashRoom bath;
	Men(WashRoom bath){
		this.bath=bath;
	}
 @Override
public void run() {
	bath.bathroom12();
}
}
class Women extends Thread{
	private WashRoom bath;
	public Women(WashRoom bath) {
		this.bath=bath;
	}
	 @Override
	 public void run() {
		 bath.bathroom12();
	 }
}
class Gay extends Thread{
	private WashRoom bath;
	Gay(WashRoom bath){
		this.bath=bath;
	}
	
		 @Override
		 public void run() {
			 bath.bathroom12();
		 }
}
public class Revision {

    public static void main(String[] args) throws InterruptedException {
    	WashRoom bath=new WashRoom();
         Men men = new Men(bath);
         men.setName("Men");
          Women women = new Women(bath);
          women.setName("Women");
          Gay gay = new Gay(bath);
          gay.setName("gay");
          men.start();
          men.join();
          gay.start();
          women.start();
        }
}

