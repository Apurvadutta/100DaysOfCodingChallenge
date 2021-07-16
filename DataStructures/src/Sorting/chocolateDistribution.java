package Sorting;

//Chocolate Distribution Problem

/*Given an array of n integers where each value represents the number of 
 * chocolates in a packet. Each packet can have a variable number of chocolates. 
 * There are m students, the task is to distribute chocolate packets such that: 

     1. Each student gets one packet.
     
     2. The difference between the number of chocolates in the 
        packet with maximum chocolates and packet with minimum 
        chocolates given to the students is minimum.*/

import java.util.*;
public class chocolateDistribution {

	public static void main(String[] args) {

		int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
		int m = 5;
		int n = arr.length;
		
		System.out.println("Minimum difference is : " + findMinDiff(arr, n, m));
	}

	private static int findMinDiff(int[] arr, int n, int m) {
		
		if(n == 0 || m == 0)
			return 0;
		
		if(n < m)
			return -1;
		
		Arrays.sort(arr);
		
		int minDiff = Integer.MAX_VALUE;
		
		for(int i = 0; i+m-1 < n; i++) {
			int diff = arr[i+m-1] - arr[i];
			if(diff < minDiff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}
}