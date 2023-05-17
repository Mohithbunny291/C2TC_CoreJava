package com.cg.corejavamultithreading;

class Runner extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Count - " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception Occured");
			}
		}
	}
}

public class App1 {

	public static void main(String args[]){
		Runner run1 = new Runner();
		run1.start();		
	}
	
}
