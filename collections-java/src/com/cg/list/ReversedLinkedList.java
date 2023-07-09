package com.cg.list;

import java.util.*;
public class ReversedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.println("Total numbers to Reverse");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Add numbers from 1 to 5
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        // Reverse the list
        LinkedList<Integer> reversedNumbers = new LinkedList<>();
        while (!numbers.isEmpty()) {
            reversedNumbers.addFirst(numbers.removeFirst());
        }

        System.out.println(reversedNumbers);
    }
}
