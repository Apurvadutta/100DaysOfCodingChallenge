package LinkedLists;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class compareTwoLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while(head1 != null && head2 != null && head1.data == head2.data){
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1 == head2) ? true : false;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
    	
            SinglyLinkedList llist1 = new SinglyLinkedList();
            System.out.println("enter the no. of elements in list 1");
            int llist1Count = scanner.nextInt();
            System.out.println("enter the elements in list 1");
            for (int i = 0; i < llist1Count; i++) {
                llist1.insertNode(scanner.nextInt());
            }
          
          	SinglyLinkedList llist2 = new SinglyLinkedList();
          	System.out.println("enter the no. of elements in list 2");
            int llist2Count = scanner.nextInt();
            System.out.println("enter the elements in list 2");
            for (int i = 0; i < llist2Count; i++) {
                llist2.insertNode(scanner.nextInt());
            }

            boolean result = compareLists(llist1.head, llist2.head);
            
            System.out.println(result == true ? "true" : "false");

        }
    }

