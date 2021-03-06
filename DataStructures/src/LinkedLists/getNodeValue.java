package LinkedLists;
import java.util.*;
import java.io.*;
public class getNodeValue {
	
	static class SinglyLinkedListNode{
		public int data;
		public SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}
	static class SinglyLinkedList{
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
	public static int getNode(SinglyLinkedListNode head, int positionFromTail) {
		SinglyLinkedListNode h1 = head;
		SinglyLinkedListNode h2 = head;
		
		for(int i = 0; i < positionFromTail; i++) {
			h1 = h1.next;
		}
		while(h1 != null) {
			h1 = h1.next;
			h2 = h2.next;
		}
		return h2.data;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList llist = new SinglyLinkedList();
		System.out.println("Enter the no. of elements");
		int n = sc.nextInt();
		System.out.println("Enter the Elements");
		for(int i = 0; i < n; i++) {
			llist.insertNode(sc.nextInt());
		}
		System.out.println("Enter the position of node from tail");
		int position = sc.nextInt();
		int result = getNode(llist.head, position);
		System.out.println(result);
	}

}
