package Searching;

//Leftmost and rightmost indices of the maximum and 
//the minimum element of an array. When the array is unsorted. 

/*Given an array arr[], the task is to find the leftmost 
 * and the rightmost indices of the minimum and the maximum 
 * element from the array where arr[] consists of non-distinct elements.*/

public class leftMostRightMostIndex {

	public static void main(String[] args) {
		
		int arr[] = {2,1,1,2,1,5,6,5};
		int n = arr.length;
		
		findIndices(arr,n);
	}

	private static void findIndices(int[] arr, int n) {
		
		int leftMin = 0, rightMin = 0, leftMax = 0, rightMax = 0;	
		int min = arr[0], max = arr[0];
		
		for(int i = 1; i < n; i++) {
			
			if(arr[i] < min) {
				leftMin = rightMin = i;
				min = arr[i];
			}else if(arr[i] == min){
				rightMin = i;
			}
			if(arr[i] > max) {
				leftMax = rightMax = i;
				max = arr[i];
			}else if(arr[i] == max) {
				rightMax = i;
			}
		}
		System.out.println("Minimum left : " + leftMin);
        System.out.println("Minimum right : " + rightMin);
        System.out.println("Maximum left : " + leftMax);
        System.out.println("Maximum right : " + rightMax);
	}
}