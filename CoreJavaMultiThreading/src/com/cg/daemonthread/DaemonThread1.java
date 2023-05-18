package com.cg.daemonthread;

public class DaemonThread1 implements Runnable{
	 public void run() {
         System.out.println("Daemon thread is running");

         try {
             Thread.sleep(2000); // Simulate some work for 2 seconds
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         System.out.println("Daemon thread is done");
     }
    
}
