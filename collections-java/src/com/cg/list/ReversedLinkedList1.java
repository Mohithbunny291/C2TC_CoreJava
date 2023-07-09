package com.cg.list;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReversedLinkedList1 {
    public static void main(String[] args) {
        Node head = null;
        System.out.println("Total numbers to Reverse");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Create a linked list with numbers from 1 to 5
        for (int i = 1; i <= n; i++) {
            head = insertAtEnd(head, i);
        }

        
        printList(head);

        // Reverse the linked list
        Node reversedHead = reverseList(head);

        
        printList(reversedHead);
    }

    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        return head;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
