package Sorting;

//Sort an array of 0s, 1s, 2s and 3s

/*Given an array arr[] of size N consisting of 0, 1, 2, and 3 only, 
 * the task is to sort the given array in ascending order.*/

public class sort0s1s2s3s {

	public static void main(String[] args) {
		
		int arr[] = { 3, 2, 1, 0, 2, 3, 1, 0 };
		int n = arr.length;
		
		sortArrays(arr, n);
	}

	private static void sortArrays(int[] arr, int n) {

		int low = 0, mid = 0, high = n-1;
		
		while(mid <= high) {
			
			if(arr[mid] == 0) {
				swapArray(arr, low, mid);
				low++;
				mid++;
			}
			
			if(arr[mid] == 3) {
				swapArray(arr, mid, high);
				high--;
			}
			
			if(arr[mid] == 1 || arr[mid] == 2) {
				mid++;
			}
		}
		while(low <= high) {
			
			if(arr[low] == 2) {
				swapArray(arr, low, high);
				high--;
			}else {
				low++;
			}
		}
		for(int i : arr)
			System.out.print(i + " ");
		
	}

	private static void swapArray(int[] arr, int a, int b) {

		int item = arr[a];
		arr[a] = arr[b];
		arr[b] = item;
		
	}

}