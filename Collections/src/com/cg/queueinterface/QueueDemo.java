package com.cg.queueinterface;

import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Dave");

        System.out.println("Queue: " + queue);

        // Accessing the head element
        String head = queue.peek();
        System.out.println("Head: " + head);

        // Removing elements from the queue
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after removal: " + queue);
    }
}
