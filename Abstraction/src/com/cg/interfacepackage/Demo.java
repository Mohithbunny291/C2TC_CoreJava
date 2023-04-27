package com.cg.interfacepackage;

interface Inf1{
	void display(); //public
	/*
	   void Show{
		
	   } error
	*/
	static void show() {
		System.out.println("Direct Interface");
	}
	
}
public class Demo implements Inf1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		obj.display();
		Inf1.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
