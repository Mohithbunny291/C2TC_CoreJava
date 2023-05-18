package com.cg.corejavamultithreading;

import java.util.*;

class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			System.out.println("Thread " + Thread.currentThread().getId()+ 
					" is running");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			
			System.out.println("Exception is caught");
		}
	}
}


public class App3 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object= new MultithreadingDemo();
			object.start();
		}
	}
}
