package com.handling;

import java.util.Scanner;

class Demo1 extends Thread{
	 Scanner scanner=new Scanner(System.in);
	 @Override
	public void run()  {
	
  System.out.println("Enter the NUmber ");
  try {
  int a=scanner.nextInt();
	System.out.println("Ener the Number");
	int b=scanner.nextInt();
	int c=a/b;
	System.out.println(c);}
  catch(Exception e) {
	  e.printStackTrace();
  }
  
	System.out.println("Adding completed");
}
	
}
class Demo2 extends Thread{
 @Override
public void run() {
	System.out.println("Printing number started");
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		try {
		Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
class Demo3 extends Thread{
	@Override
	public void run() {
		System.out.println("Printing character");
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
			Thread.sleep(3000);
			}
			catch (Exception e) {
				
			}
		
	}
}
}
public class practice {

	public static void main(String[] args) {
		Demo1  d1 = new Demo1();
		Demo2  d2 = new Demo2();
		Demo3  d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
      
	}

}
