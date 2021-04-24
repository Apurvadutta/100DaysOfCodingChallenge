package LinkedLists;
import java.util.*;
import java.io.*;
public class insertHeadNode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println("enter the size of the LinkedList");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		for(int i = 0; i < n; i++) {
			ll.add(sc.nextInt());
		}
		System.out.println("enter the node to insert at head");
		int toAdd = sc.nextInt();
		
		ll.addFirst(toAdd);
        System.out.println(ll);
        ll.add(0,toAdd);
        System.out.println(ll);
	}
}
