package org.cg.polymorphism;

public class MethodOverloading {
	public int sub(int a, int b) {
		return a-b;
	}
	public float sub(int a, Float b) {
		return a-b;
	}
	public String print(String str) {
		return str;
	}
	public String print(String str, String str1) {
		return str+str1;
	}
}
