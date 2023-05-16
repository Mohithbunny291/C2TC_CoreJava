package com.cg.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		cp.takeoff();
		PassangerPlane pp = new PassangerPlane();
		pp.takeoff();
		PassangerPlane ap = new AnimalPlane();
		ap.Landing();
		
	}

}
