package com.cg.setinterface;

import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> ts = new TreeSet<>();
		ts.add("KIK");
		ts.add("13");
		ts.add("Mohiht");
		ts.add("Szring Boot");
		ts.add("pAthon");
		ts.add("Python");
		System.out.println(ts);
		
		Set<String> addsubset = ts.subSet("Szring Boot","Python");
		System.out.println(addsubset);
	}

}
