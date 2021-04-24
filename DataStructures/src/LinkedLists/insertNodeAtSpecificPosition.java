package LinkedLists;
import java.util.*;
import java.io.*;
public class insertNodeAtSpecificPosition {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			LinkedList<Integer> ll = new LinkedList<>();
			System.out.println("enter the size of the LinkedList");
			int n = sc.nextInt();
			System.out.println("Enter " + n + " elements");
			for(int i = 0; i < n; i++) {
				ll.add(sc.nextInt());
			}
			System.out.println("enter the node to insert");
			int toAdd = sc.nextInt();
			System.out.println("enter the position to insert the node");
			int addAt = sc.nextInt();
			ll.add(addAt,toAdd);
	        System.out.println(ll);
		}
}
