package com.thread;

import java.util.Scanner;

class Demo1 implements Runnable{
	private Scanner scan;
	public Demo1(Scanner scan) {
		this.scan=scan;
	}
	@Override
	public void run() {
		int n;
		System.out.println("Ener the Number :");
        synchronized (scan) {
        	 n=scan.nextInt();
    		System.out.println("Factorial Starts:");
	          	}
		
		int factoral=1;
		for(int i=1;i<=n;i++) {
			factoral*=i;
		}
		
		System.out.println("factorial : " +factoral);
		System.out.println("Factorial Ends:");
	}

}
 class  Demo2 implements Runnable{
	 private Scanner scan;
	 
	public Demo2(Scanner scan) {
		
		this.scan = scan;
	}
	@Override   
	public void run() {
		int n;
		System.out.println("Ener the Number :");
		synchronized (scan) {
			 n=scan.nextInt();

			System.out.println("Printing prime Number Starts:");
		}
	
		for(int i=1;i<=n;i++) {
			if(primenumber(i)) {
				System.out.println(i+" ");
			}
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Printing prime Number Ends:");
	}
	private boolean primenumber(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
 class Demo3 implements Runnable{
	 private Scanner scan;
	 
	 public Demo3(Scanner scan) {
		
		this.scan = scan;
	}

	@Override
	public void run() {
		
			int n;
			System.out.println("Ener the Number :");
			synchronized (scan) {
				 n=scan.nextInt();

					System.out.println("Printing fibonacci Starts:");
			}
			
			int start=0;
			int firsts=1;
			for(int i=0;i<=n;i++) {
				
				  System.out.println(start+" ");
				  int new1=firsts+start;
				  start=firsts;
				  firsts=new1;
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Printing fibonacci Ends:");
	}
 }
public class MultiThreading {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Demo1 d1 = new Demo1(scan);
		Demo2 d2 = new Demo2(scan);
		 Demo3 d3 = new Demo3(scan);
		  Thread t1 = new Thread(d1);
		  Thread t2 = new Thread(d2);
		  Thread t3 = new Thread(d3);
		  t1.start();
		  t2.start();
		  t3.start();
		
		
	}
}
