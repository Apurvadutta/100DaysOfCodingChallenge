package LinkedLists;
import java.util.*;
import java.io.*;
public class reversePrint {
 
	static void reverse(LinkedList<Integer> ll) {
		LinkedList<Integer> newll = new LinkedList<>();
		while(!ll.isEmpty()) {
			newll.add(ll.removeLast());
		}
		System.out.println(newll);
		for(Integer a : newll) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no. of test cases");
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println("Enter the no. of elements to be entered");
			int n = sc.nextInt();
			LinkedList<Integer> ll = new LinkedList<>();
			System.out.println("Enter the elements");
			for(int j = 0; j < n; j++) {
				ll.add(sc.nextInt());
			}
			System.out.println(ll);
		    reverse(ll);
		}
	}

}
