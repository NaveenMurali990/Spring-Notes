package com.thread;
class Captain extends Thread{
	
	
	@Override
	public void run() {
		BowlingCoach bowlingCoach = new BowlingCoach();
	    bowlingCoach.setName("bowlingCoach");
	    bowlingCoach.setDaemon(true);
	    BattingCoach battingCoach = new BattingCoach();
	    battingCoach.setName("battingCoach");
	   
	    battingCoach.setDaemon(true);
	    battingCoach.start();
	    bowlingCoach.start();
	    
	   
       try {
		System.out.println("Captain went to  ground ");
		Thread.sleep(5000);
		System.out.println("Captain will do warmup");
		Thread.sleep(5000);
		System.out.println("Captain will do feilding");
		Thread.sleep(5000);
		System.out.println("Captain will do bowling");
		Thread.sleep(5000);
		System.out.println("Captain will do batting");
		Thread.sleep(5000);
		System.out.println("Captain went to room");
	}
       catch(Exception e) {
    	   e.printStackTrace();
       }
	}
}
class BattingCoach extends Thread{
	@Override
	public void run() {
		for(;;) {
			try {
			System.out.println("Batting coach in the ground");
			Thread.sleep(5000);
			
		}
			catch(Exception e) {
		    	   e.printStackTrace();
		       }
	}
}
}
class BowlingCoach extends Thread{
	@Override
	public void run() {
		for(;;) {
			try {
				System.out.println("Bowling coach in the ground");
				Thread.sleep(5000);
				
			}
				catch(Exception e) {
			    	   e.printStackTrace();
			       }
		}
	}
}
public class Deamonmawa {

	public static void main(String[] args) {
		Captain captain = new Captain();
      captain.setName("Captain");
      captain.start();
      
	}

}

