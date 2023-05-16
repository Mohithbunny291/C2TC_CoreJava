package com.cg.thisconstructorcall;

public class ThisClassCall {
	public ThisClassCall() {
		System.out.println("Default Constructor");
	}
	ThisClassCall(int a, int b){
		this();
		System.out.println("Parameter Constructor a: "+a+" b: "+b);
	}
}
