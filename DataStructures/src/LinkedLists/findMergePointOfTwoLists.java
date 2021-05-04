//package LinkedLists;
//
//import java.util.*;
//import java.io.*;
//
//public class findMergePointOfTwoLists {
//	
//	static class SinglyLinkedListNode{
//		public int data;
//		public SinglyLinkedListNode next;
//		public SinglyLinkedListNode(int nodeData) {
//			this.data = nodeData;
//			this.next = null;
//		}
//	}
//
//	static class SinglyLinkedList{
//		public SinglyLinkedListNode head;
//		public SinglyLinkedListNode tail;	
//		public SinglyLinkedList() {
//			this.head = null;
//			this.tail = null;
//		}
//		public void insertNode(int nodeData) {
//			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
//			if(this.head == null) {
//				this.head = node;
//			}else {
//				this.tail.next = node;
//			}
//			this.tail = node;
//		}
//		
//	}
//	static int mergePoint(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//		SinglyLinkedListNode currHead1 = head1;
//		SinglyLinkedListNode currHead2 = head2;
//		while(currHead1!= currHead2) {
//			if(currHead1.next == null) {
//				currHead1 = head2;
//			}else {
//				currHead1 = currHead1.next;
//			}
//			if(currHead2.next == null) {
//				currHead2 = head1;
//			}else{
//				currHead2 = currHead2.next;
//			}
//		}
//		return currHead1.data;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		SinglyLinkedList list1 = new SinglyLinkedList();
//		SinglyLinkedList list2 = new SinglyLinkedList();
//		System.out.println("Enter the no. of elements in list 1");
//		int count1 = sc.nextInt();
//		System.out.println("Enter the elements in list 1");
//		for(int i = 0; i < count1; i++) {
//			list1.insertNode(sc.nextInt());
//		}
//		System.out.println("Enter the no. of elements in list 2");
//		int count2 = sc.nextInt();
//		System.out.println("Enter the elements in list 2");
//		for(int i = 0; i < count2; i++) {
//			list2.insertNode(sc.nextInt());
//		}
//
//		int list3 = mergePoint(list1.head, list2.head);
//			System.out.println(list3);
//
//	}
//
//}
