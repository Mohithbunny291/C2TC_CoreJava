package com.cg.completecollections;

import java.util.*;

public class CollectionsComplete {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList example
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);

        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("John");
        hashSet.add("Alice");
        hashSet.add("Bob");
        System.out.println("HashSet: " + hashSet);

        // TreeSet example
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(4);
        System.out.println("TreeSet: " + treeSet);

    }
}

