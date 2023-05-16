package com.cg.inheritance;

class Cargo extends CargoPlane	{
	public Cargo() {
		System.out.println("Cargo Constructor");
	}
}
public class Plane1 extends Cargo{

	public static void main(String[] args) {
		Cargo p1 = new Cargo();
		System.out.println(p1 instanceof Cargo);
		Plane1 p2 = null;
		System.out.println(p2 instanceof Cargo);
	}

}
