package Searching;

//Find bitonic point in given bitonic sequence.

/*You are given a bitonic sequence, the task is to find Bitonic Point in it. 
 * A Bitonic Sequence is a sequence of numbers which is first strictly 
 * increasing then after a point strictly decreasing.
 * 
 * A Bitonic Point is a point in bitonic sequence before which elements are 
 * strictly increasing and after which elements are strictly decreasing. 
 * A Bitonic point doesn’t exist if array is only decreasing or only increasing.
 */
public class bitonicPoint {
	
	public static void main(String[] args) {
		
		int arr[] = {6, 7, 8, 11, 9, 5, 2, 1};
	    int n = arr.length;
	    
		int index = binarySearch(arr, 1, n-2);
		
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int left, int right) {
		
		if(left <= right) {
			int mid = (left + right)/2;
			
			if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) 
				return mid;
			
			if(arr[mid] < arr[mid+1]) 
				return binarySearch(arr, mid+1, right);
			else 
				return binarySearch(arr, left, mid-1);
		}
		return -1;
	}
	
}