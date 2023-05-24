package com.cg.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Comparable> list1 = new ArrayList<Comparable>();
		System.out.println(list1.size());
		list1.add(12);
		list1.add(34);
		list1.add("Mohith");
		list1.add(true);
		list1.add(false);
		list1.add(34.3);
		list1.add(34);
		list1.add(5,"HI");
		list1.add(8,13);
		System.out.println(list1);
	}

}
