package LinkedLists;
import java.util.*;
import java.io.*;
public class printElements {
	    public static void main(String args[]) 
	    { 
	        Scanner sc = new Scanner(System.in);
	    	LinkedList<String> ll = new LinkedList<>(); 
	         int n = sc.nextInt();
	         for(int i = 0; i < n; i++) {
	                 ll.add(sc.next()); 
	         }
	        for (int i = 0; i < ll.size(); i++) {
	            System.out.print(ll.get(i) + " "); 
	        } 
	        System.out.println();
	        for (String str : ll) 
	            System.out.print(str + " "); 
	    } 
	} 


