package com.thread;
import java.util.Scanner;
class Demo extends Thread{
	@Override
	public void run() {

		if(	Thread.currentThread().getName().equals("ADD")) {
			   Add();
		}
		else if(Thread.currentThread().getName().equals("Num")) {
			Numbers();
		}
		else {
		Sub();
		}
	}
	public void Add() {
		System.out.println("Adding the numbers startes");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number 1");
		int a=scan.nextInt();
		System.out.println("Enter the Number 2");
		int b=scan.nextInt();
		System.out.println("the Sum of two Numbers: "+ (a+b));
	}
	public void Numbers() {
		System.out.println("Printing the Numbers");
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(3000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void Sub() {
		System.out.println("Printing the Numbers");
		for(int i=65;i<=68;i++) {
			try {
				Thread.sleep(3000);
				System.out.println((char)i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Onerunmethod {

	public static void main(String[] args) {
	Demo d1 = new Demo();
	d1.setName("ADD");
          Demo d2 = new Demo();
          d2.setName("Num");
          Demo d3 = new Demo();
          d3.setName("Chars");
          d1.start();
          d2.start();
          d3.start();
	}

}
