package Searching;
// Binary Search Iteratively.
public class binarySearchIteratively {

	public static void main(String[] args) {

		int[] arr =  {1, 3, 5, 9, 67, 123, 125};
		int key = 3;
		int pos = binarySearch(arr, key);
		System.out.println(pos);
	}
	private static int binarySearch(int[] arr, int key) {

		int low = 0, high = arr.length-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(arr[mid] == key) return mid;
			else if (arr[mid] > key) high = mid-1;
			else low = mid+1;
		}
		return -1;
	}
}
