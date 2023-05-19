package com.cg.listinterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(34);
		l1.add(52);
		l1.add(342);
		l1.addFirst(31);
		l1.addFirst(43);
		l1.add(1,3);
		l1.addLast(54);
		System.out.println(l1);
		
		System.out.println(l1.get(3));
		
		l1.remove(2);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		ListIterator<Integer> l2 = l1.listIterator();
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}
	}

}
