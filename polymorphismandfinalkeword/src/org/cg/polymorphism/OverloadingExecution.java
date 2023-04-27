package org.cg.polymorphism;

public class OverloadingExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m1 = new MethodOverloading();
		System.out.println(m1.sub(12, 2));
		System.out.println(m1.sub(34, 233));
		System.out.println(m1.print("mohith"));
		System.out.println(m1.print("adjb", "akdb"));
		
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(32);
		ConstructorOverloading c3 = new ConstructorOverloading(23,32);
	}

}
