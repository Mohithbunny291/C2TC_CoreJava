package com.cg.cardinheritance;

public class Hacker extends CreditCard{
	void changeDetails() {
		cardno = 3412123;
		pin = 2131;
		System.out.println(cardno+" "+pin);
	}
	
	public void viewDetails(){
		Hacker h = new Hacker();
		h.changeDetails();
		System.out.println(pin);
		System.out.println(cardno);
	}
}
