package com.cg.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("Mango");
		fruitCollection.add("Apple");
		fruitCollection.add("nut");
		fruitCollection.add("Gova");
		System.out.println(fruitCollection);
		fruitCollection.remove("nut");
		System.out.println(fruitCollection);
		
		fruitCollection.forEach((element) ->{
			System.out.println(element);
		});
	}

}
