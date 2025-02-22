package com.handling;

import java.util.Scanner;

class Atm{
	int pin=1234;
	int p;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
	}
	void verify() {
		if(pin==p) {
			System.out.println("collect your money");
		}
		else {
			System.out.print("Invalid Input");
		}
	}
}
class Bank{
	void init(){
		Atm a = new Atm();
		a.acceptInput();
		a.verify();
		
	}
}

public class Doubts {

	public static void main(String[] args) {
	      Bank b = new Bank();
	      b.init();
  }
}
