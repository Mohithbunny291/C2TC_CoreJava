package com.cg.lambdaStart;

public class Lambdas {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		Printable po = () -> System.out.println("Meow");
		po.print();
		
		printThing(po);
		
		c.print();
		
		printThing(c);
		
		printThing(() -> System.out.println("Meow"));
	}
	
	static void printThing(Printable p) {
		p.print();
	}
	
	

}
