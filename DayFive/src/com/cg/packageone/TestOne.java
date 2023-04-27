package com.cg.packageone;

public class TestOne {

	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int  i = 5;
	
	public void display() {
		System.out.println("Public within testone");
	}
	
	protected void name() {
		System.out.println("Protected within testone");
	}
	
	void name1() {
		System.out.println("In Default");
	}
	
	private void display1() {
		System.out.println("In TestOne method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOne t1 = new TestOne();
		System.out.println(t1.i);
		t1.display1();
		t1.display();
		t1.name();
		t1.name1();
	}

}
