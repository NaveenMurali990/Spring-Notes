package com.thread;
class BathRoom{
	 void bathRoom() {
		
		try {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+" entered the Bathrrom");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" using the Bathrrom");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" exited the Bathrrom");
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class BOY  extends Thread{
	private BathRoom bathRoom;
	public BOY(BathRoom bathRoom) {
		this.bathRoom=bathRoom;
	}
	 @Override
	public void run() {
		bathRoom.bathRoom();
}
	 
}
class Girl extends Thread{
	
	private BathRoom bathRoom;
	public Girl(BathRoom bathRoom) {
		this.bathRoom=bathRoom;
	}
	@Override
	public void run() {
	
		bathRoom.bathRoom();
	}
}

class OTHERS extends Thread{
	
	private BathRoom q;
	public OTHERS(BathRoom bathRoom) {
	 q=bathRoom;
	}
	@Override
	public void run() {
		q.bathRoom();
	}
}
public class SInchronization {

	public static void main(String[] args)  {
             BathRoom bathRoom = new BathRoom();
             BOY boy = new BOY( bathRoom);
             boy.setName("Boy");
             Girl girl = new Girl( bathRoom);
             girl.setName("girl");
              OTHERS others = new OTHERS( bathRoom);
              others.setName("others");
              boy.start(); 
             
               girl.start();
            
               others.start();
              
               
	}

}
