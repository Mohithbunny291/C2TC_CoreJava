package com.cg.inheritance;

public class Plane {
	public Plane() {
		System.out.println("Plane Constructor");
	}
	protected void takeoff() {
		System.out.println("Plane take off");
	}
	void fly() {
		System.out.println("Flying");
	} 
	void land() {
		System.out.println("Landing");
	}
}


