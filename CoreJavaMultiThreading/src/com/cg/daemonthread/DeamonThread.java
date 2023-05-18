package com.cg.daemonthread;

public class DeamonThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" Is Daemon Thread "+Thread.currentThread().isDaemon());
		}
	}
}
