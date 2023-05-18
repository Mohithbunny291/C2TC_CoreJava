package com.cg.daemonthread;

public class MainThread {

	public static void main(String[] args) {
		
		//DeamonThread
//		DeamonThread dt = new DeamonThread();
//		dt.setDaemon(true);
//		dt.start();
//		System.out.println("Main Thread");
		
		
		//DaemonThread1
		
		// Create a user thread
        UserThread UR = new UserThread();
        Thread ur = new Thread(UR);
        ur.run();

        // Create a daemon thread
        DaemonThread1 DT1 = new DaemonThread1();
        Thread DT = new Thread(DT1);
        DT.setDaemon(true); // Set the thread as daemon
        DT.run();;

        // Main thread continues execution
        System.out.println("Main thread is running");
		
	}

}
