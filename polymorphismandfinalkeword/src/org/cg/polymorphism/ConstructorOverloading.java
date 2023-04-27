package org.cg.polymorphism;
	
public class ConstructorOverloading {
		
	private int a;
	private int b;
	public ConstructorOverloading() {
		System.out.println("Default Con");
	}
	public ConstructorOverloading(int a) {
		System.out.println("Parameter Con "+a);
	}
	public ConstructorOverloading(int a, int b) {
		System.out.println("Parameter Con "+a+b);
	}
}
