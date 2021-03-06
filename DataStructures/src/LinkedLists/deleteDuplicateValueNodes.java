package LinkedLists;
import java.util.*;
import java.io.*;
public class deleteDuplicateValueNodes {

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
			if(this.head == null) {
				this.head = node;
			}else {
				this.tail.next = node;
			}
			this.tail = node;
		}
		
	}
	public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
		if(head == null) return head;
		SinglyLinkedListNode curr = head.next; 
		while(curr != null && curr.data == head.data) {
			curr = curr.next;
		}
		head.next = removeDuplicates(curr);
		return head;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList listt = new SinglyLinkedList();
		System.out.println("Enter the no. of elements");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i = 0; i < n; i++) {
			listt.insertNode(sc.nextInt());
		}
		SinglyLinkedListNode llist = removeDuplicates(listt.head);

		while(llist != null) {
			System.out.println(llist.data);
			llist = llist.next;
		}

	}

}
