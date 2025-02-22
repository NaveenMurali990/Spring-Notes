package com.handling;

import java.util.Scanner;
class Alpha {
	void method() throws Throwable{
		System.out.println("Connection is Established");
	    try {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the Numerator");
	   int a=scan.nextInt();
	   System.out.println("Enter the Dineminator");
	   int b=scan.nextInt();
	   int c=a/b;
	   System.out.println(c);
	 
	   scan.close();
	    }
	   
	    catch(Exception e) {
	    	 throw e;
	    }
	  finally {
		  System.out.println("connection is terminated");
		 
	  }
	  
	}
	
}
public class Handling {

	public static void main(String[] args) {
	try {	
      Alpha a=new Alpha();
      a.method();
     }
     catch(Throwable e) {
    	 System.out.print("ji");
     }
	}

}
