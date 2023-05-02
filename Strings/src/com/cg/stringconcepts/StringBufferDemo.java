package com.cg.stringconcepts;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(16);
		System.out.println(sb.capacity());
		sb.append("Java");
		System.out.println(sb.capacity());
		sb.append("Is a programming language"); //25
		System.out.print(sb.capacity());

	}

}
