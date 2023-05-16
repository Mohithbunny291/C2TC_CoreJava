package com.cg.cardinheritance;

public class Hacker extends CreditCard{
	void changeDetails() {
		cardno = 3412123;
		pin = 2131;
	}
	
	void viewDetails(){
		System.out.println(cardno);
		System.out.println(pin);
	}
}
