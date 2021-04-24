package LinkedLists;
import java.util.*;
import java.io.*;
public class insertTailNode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ll = new LinkedList<>();
		System.out.println("enter the size of the LinkedList");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		for(int i = 0; i < n; i++) {
			ll.add(sc.nextInt());
		}
		System.out.println("enter the last node to insert");
		int toAdd = sc.nextInt();
		
		ll.add(toAdd);
        System.out.println(ll);
	}

}
