package Sorting;

//Sort an array in wave form

/*Given an unsorted array of integers, sort the array into a wave 
 * like array. An array ‘arr[0..n-1]’ is sorted in wave form 
 * if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..*/

public class waveArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
		int n = arr.length;
		
		waveSorting(arr, n);
		
		for(int i : arr)
			System.out.print(i + " ");
	}

	private static void waveSorting(int[] arr, int n) {

		for(int i = 0; i < n; i+=2) {
			
			if(i>0 && arr[i] < arr[i-1])
				swapArray(arr, i-1, i);
			
			if(i<n-1 && arr[i] < arr[i+1])
				swapArray(arr, i, i+1);
		}
		
	}

	private static void swapArray(int[] arr, int a, int b) {
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}