package com.cg.corejavamultithreading;

import java.util.Scanner;

public class MainThread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
//		//App3
//		System.out.println("Enter a number of threads to be run: ");
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		for (int i = 0; i < n; i++) {
//			MultithreadingDemo object= new MultithreadingDemo();
//			object.start();
//		}
//		
//		//App2
//		App2 app2 = new App2();
//		app2.doWork();
//		
//		//App1
//		App1 a = new App1();
//		Runner run1 = new Runner();
//		run1.start();
		
		//AppImplementsRunnable
		AppImplementsThread AIT = new AppImplementsThread();
		Thread t = new Thread(AIT);
		t.run();
	}

}
