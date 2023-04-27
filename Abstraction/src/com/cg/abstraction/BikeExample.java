package com.cg.abstraction;

abstract class bike{
	public bike() {
		// TODO Auto-generated constructor stub
		System.out.println("Bike Constructor");
	}
	abstract void run();
	void changeGare() {
		System.out.println("Gear Changed");
	}
}
class R15 extends bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("R15");
	}
	
}
public class BikeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R15 obj = new R15();
		obj.changeGare();
		obj.run();
	}

}
