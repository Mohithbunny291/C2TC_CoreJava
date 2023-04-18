package com.cg.thiskeyword;
//this - refers to the current obj
public class Justification {
	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		Justification j1 = new Justification();
		System.out.println(j1);
		j1.show();
	}
}
