package com.cg.completecollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {

	public static void main(String[] args) {
		
		List<String> myList1 = Arrays.asList("Apple", "Banana", "Orange");

		for (int i = 0; i < myList1.size(); i++) {
		    String item = myList1.get(i);
		    System.out.println(item);
		}
		System.out.println();
		List<String> myList2 = Arrays.asList("Apple", "Banana", "Orange");

		for (String item : myList1) {
		    System.out.println(item);
		}
		System.out.println();
		List<String> myList3 = Arrays.asList("Apple", "Banana", "Orange");

		Iterator<String> iterator = myList1.iterator();
		while (iterator.hasNext()) {
		    String item = iterator.next();
		    System.out.println(item);
		}
		System.out.println();
		List<String> myList4 = Arrays.asList("Apple", "Banana", "Orange");

		myList4.forEach(item -> {
		    System.out.println(item);
		});
		System.out.println();
		List<String> myList5 = Arrays.asList("Apple", "Banana", "Orange");

		myList5.forEach(System.out::println);

	}

}
