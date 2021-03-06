package LinkedLists;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class mergeTwoSortedLinkedLists {
	
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

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    	if(head1 == null) return head2;
    	if(head2 == null) return head1;
    	if(head1.data < head2.data) {
    		head1.next = mergeLists(head1.next, head2);
    		return head1;
    	}else {
    		head2.next = mergeLists(head1, head2.next);
    		return head2;
    	}
    	
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

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);
            while(llist3 != null) {
            	System.out.println(llist3.data);
            	llist3 = llist3.next;
            }
            

        }

}
