package Searching;
//Binary Search Recursively.
public class binarySearchRecursively {

	public static void main(String[] args) {

			int[] arr =  {1, 3, 5, 9, 67, 123, 125};
			int key = 125;
			int low = 0;
			int high = arr.length-1;
			int pos = binarySearch(arr, key, low, high);
			System.out.println(pos);
		}
	private static int binarySearch(int[] arr, int key, int low, int high) {
		
		if(low > high) return -1;
		int mid = (low + high)/2;
		if(arr[mid] == key) return mid;
		if(arr[mid] > key) return binarySearch(arr, key, low, mid-1);
		return binarySearch(arr, key, mid+1, high);
	}
}
