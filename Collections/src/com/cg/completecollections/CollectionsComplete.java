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

        // HashMap example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);
        System.out.println("HashMap: " + hashMap);

        // TreeMap example
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 15);
        System.out.println("TreeMap: " + treeMap);

        // PriorityQueue example
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(4);
        System.out.println("PriorityQueue: " + priorityQueue);

        // ArrayDeque example
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Alice");
        arrayDeque.add("Bob");
        arrayDeque.add("Charlie");
        System.out.println("ArrayDeque: " + arrayDeque);

        // Stack example
        Stack<String> stack = new Stack<>();
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");
        System.out.println("Stack: " + stack);

        // Vector example
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);
    }
}

