package com.cg.setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
		lhset.add(10);
		lhset.add(20);
		lhset.add(15);
		lhset.add(42);
		lhset.add(10);
		System.out.println(lhset);
		//Collections.sort(lhset);
		ArrayList<Integer> al = new ArrayList<>(lhset);
		Collections.sort(al);
		System.out.println(al);
	}

}
