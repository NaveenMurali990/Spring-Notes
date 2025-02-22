package com.thread;
class PrinterSonu implements Runnable{
	
	@Override
	
	    public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+"started printing ");
		for(int i=1;i<=3;i++) {
			System.out.println(name+"started printing page "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+"completed printing");
	}
}
public class MAWA {

	public static void main(String[] args) {
		PrinterSonu p=new PrinterSonu();
	Thread t1=new Thread(p);
	t1.setName("men");
	Thread t2=new Thread(p);
	t2.setName("women");
	Thread t3=new Thread(p);
	t3.setName("children");
	 
	 t1.start();
	 t2.start();
	 t3.start();
	}

}
