package com.cg.inheritance;

public class CargoPlane extends Plane{
	public CargoPlane() {
		System.out.println("Cargoplane Constructor");
	}
}

class PassangerPlane extends Plane{
	protected void takeoff() {
		System.out.println("PassangerPlane TakeOff");
	}
	void Landing() {
		System.out.println("PassangerPlane Landing");
	}
}
class AnimalPlane extends PassangerPlane{
	void Landing() {
		super.takeoff();
		System.out.println("Animal to Passanger Landing");
	}
	
}
