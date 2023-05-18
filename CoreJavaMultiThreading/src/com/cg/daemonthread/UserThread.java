package com.cg.daemonthread;

public class UserThread implements Runnable{
	public void run() {
        System.out.println("User thread is running");

        try {
            Thread.sleep(2000); // Simulate some work for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("User thread is done");
    }
}
