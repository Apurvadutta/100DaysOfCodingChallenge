package Hashing;

//Find Union and Intersection of two unsorted arrays

/*Given two unsorted arrays that represent two sets (elements in every array 
 * are distinct), find the union and intersection of two arrays.
 * 
For example, if the input arrays are: 
arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 

Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} 
and Intersection as {3, 6, 7}. Note that the elements of union and 
intersection can be printed in any order.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class unionIntersectionArrays {

	public static void main(String[] args) {
		
		 int arr1[] = { 7, 1, 5, 2, 3, 6 };
	     int arr2[] = { 3, 8, 6, 20, 7 };
		
	     printUnion(arr1, arr2);
	     
	     printIntersection(arr1, arr2);	
	}

	private static void printIntersection(int[] arr1, int[] arr2) {

		 HashSet<Integer> hs = new HashSet<>();
		 
		for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
 
        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
                System.out.print(arr2[i] + " ");
		
	}

	private static void printUnion(int[] arr1, int[] arr2) {

		 HashSet<Integer> hs = new HashSet<>();
		 
	        for (int i = 0; i < arr1.length; i++)
	            hs.add(arr1[i]);
	        
	        for (int i = 0; i < arr2.length; i++)
	            hs.add(arr2[i]);
	        
	        ArrayList<Integer> list = new ArrayList<>(hs);
	        
	        Collections.sort(list);
	        
	        System.out.println(list);
		}
	}