//Check if a key is present in every segment of size k in an array
/* Given an array arr[] and size of array is n and one another key x, and give you a segment size k. The task is to find that the key x present in every segment of size k in arr[].
Examples: 

Input : 
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
x = 3 
k = 3 
Output : Yes 
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.
Input : 
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25} 
x = 23 
k = 5 
Output :Yes 
There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}. 
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9} 
x = 8 
k = 2 
Output : No */
package Arrays;
import java.util.*;

public class keyPresentInEverySegment {

	static boolean checkKey(int n, int arr[], int k, int s) {
		//int i= 0, j = 0;
		int segments = 0;
		if(n % 2 == 0) {
			segments = n / s;
		}else {
			segments = (n / s) + 1;
		}
		int count = 0;
		for(int i = 0; i < n ; i++) {
			if(arr[i] == k) count++;
//			for( j = i; j < i + s; j++ ) {
//				if(j < n && arr[j] == k ) {
//					count++;
//					break;
//				}
			//System.out.println(count);
			
		}
		//System.out.println(segments);
		if(count == segments) return true;
	return false;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the no. of elements in array");
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		System.out.println("Enter the elements in array");
//		for(int i = 0; i < n; i++) {
//		arr[i] = sc.nextInt();
//		}
//		System.out.println("Enter key");
//		int k = sc.nextInt();
//		System.out.println("Enter segment size");
//		int s =sc.nextInt();
		int arr[] = new int[] {5, 8, 7, 12, 14, 3};
        int k = 3, s = 2;
//		int arr[] = new int[] {5, 8, 7, 12, 14, 3, 9};
//        int k = 8, s = 2;
//		int arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25}; 
//		int k = 23; 
//		int s = 5; 
//		int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} ;
//		int k = 3 ;
//		int s = 3 ;
        int n = arr.length;
		if(checkKey(n, arr, k, s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
