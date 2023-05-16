package com.cg.thisasargument;

public class ThisAsArgument {
	void ThisAsArgument(ThisAsArgument object){
		System.out.println("This Keyword as Argument");
	}
	void m1() {
		ThisAsArgument(this);
	}
	public static void main(String[] args) {

		ThisAsArgument t1 = new ThisAsArgument();
		t1.m1();
		
		
		ThisAsArgument t2 = new ThisAsArgument();
		System.out.println(t2);
		t2.m();
	}
	void m() {
		System.out.println(this);
	}
	

}
