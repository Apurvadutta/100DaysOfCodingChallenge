package LinkedLists;
import java.util.*;
import java.io.*;
public class deleteNode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println("Enter the no. of elememnts");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i = 0; i < n; i++) {
			ll.add(sc.nextInt());
		}
		System.out.println(ll);
		System.out.println("Enter the position to delete");
		int pos = sc.nextInt();
	    ll.remove(pos);
		System.out.println(ll);
	}
}
