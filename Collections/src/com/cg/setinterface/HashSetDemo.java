package com.cg.setinterface;

import java.util.HashSet;

public class HashSetDemo {

	static void addElements(HashSet<Integer> numberhashset) {
		numberhashset.add(31);
		numberhashset.add(36);
		numberhashset.add(37);
		numberhashset.add(33);
		numberhashset.add(33);
		System.out.println(numberhashset.add(34));

	}

	public static void main(String[] args) {
		HashSet<Integer> numberhashset = new HashSet<>();
		addElements(numberhashset);
		System.out.println(numberhashset);
	}

}
