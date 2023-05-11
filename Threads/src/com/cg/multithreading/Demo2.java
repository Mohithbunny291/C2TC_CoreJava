package com.cg.multithreading;


class Counter{
	int count;
	public void increment() {
		count++;
		System.out.println(count);
	}
}


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		c.increment();
		//System.out.println();
	}

}
