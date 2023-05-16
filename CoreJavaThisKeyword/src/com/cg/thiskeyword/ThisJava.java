package com.cg.thiskeyword;

class Object1{
	
}

// this() ---> local chaining
// super() ---> constructor chaining
// this keyword help you fetch local instances
// super keyword in constructor always refer to immediate parent class

class Test1 extends Object{
	int x,y;
	Test1() {
		x = 100;
		y = 200;
	}
	Test1(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Test2 extends Test1{
	int a,b;
//	Test2() {
//		this(9,99);
//	}
	Test2(int a, int b){
		this.a = a;
		this.b = b;
	}
	void display() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}

public class ThisJava {

	public static void main(String[] args) {
		Test2 t2 = new Test2(9,99);
		t2.display();

	}

}
