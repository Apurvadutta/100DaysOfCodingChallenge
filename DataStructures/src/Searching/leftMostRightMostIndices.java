package Searching;

//Leftmost and rightmost indices of the maximum and 
//the minimum element of an array. When the array is sorted. 

/*Given an array arr[], the task is to find the leftmost 
* and the rightmost indices of the minimum and the maximum 
* element from the array where arr[] consists of non-distinct elements.*/

public class leftMostRightMostIndices {

	public static void main(String[] args) {
		
		 int arr[] = { 0, 0, 1, 2, 5, 5, 6, 8, 8 };
	     int n = arr.length;
	     System.out.println("Minimum left : " + 0);
	     System.out.println("Minimum right : " + getRightMin(arr, n));
	     System.out.println("Maximum left : " + getLeftMax(arr, n));
	     System.out.println("Maximum right : " + (n - 1));
 	}

	private static int getLeftMax(int[] arr, int n) {

		int max = arr[n-1];
		int leftMax = n-1;
		int i = n-2;
		while(i > 0 && arr[i] == max) {
			leftMax = i;
			i--;
		}
		return leftMax;
	}
	private static int getRightMin(int[] arr, int n) {
		
		int min = arr[0];
		int rightMin = 0;
		int i = 1;
		while(i < n && arr[i] == min) {
			rightMin = i;
			i++;
		}
		return rightMin;
	}
}