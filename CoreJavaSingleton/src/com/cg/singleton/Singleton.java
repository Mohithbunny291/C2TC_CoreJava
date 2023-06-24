package com.cg.singleton;

public class Singleton {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				A obj = A.getInstence();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				A obj = A.getInstence();			}
		});
		t1.start();
//		try {
//			Thread.sleep(1);
//		} catch (Exception e) {
//		}
		t2.start();
		

	}

}

//class A {
//
//	public static A obj; // if the object is created here we have eager object creation.
//
//	private A() {
//		System.out.println("getinstance");
//	}
//
//	public static synchronized A getInstence() { // we have to wait for the 1st object to complete so we go for double checked locking
//		if (obj == null) {
//			obj = new A(); // so by creating the object here the lazy initialization is done. 
//		}
//		return obj;
//	}
//}

class A {

	public static A obj;

	private A() {
		System.out.println("getinstance");
	}

	public static A getInstence() { // or by double checked locking
		
		if (obj == null) {
			synchronized (A.class) {
				if (obj == null) {
					obj = new A();
				}
			}
		}
		return obj;
	}
}
