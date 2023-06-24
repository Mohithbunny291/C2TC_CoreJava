package com.cg.singletoncomusingenum;

public class SingletonEnum {

	public static void main(String[] args) {

		abc obj1 = abc.INSTENCE;
		obj1.i = 100;
		obj1.show();
		
		abc obj2 = abc.INSTENCE;
		obj1.i = 200;
		obj2.show();
	}

}

enum abc{ //special type of classs as it have private constructor internally.
	
	INSTENCE;
	int i;
	public void show() {
		System.out.println(i);
	}	
}