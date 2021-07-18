package Matrix;

//Search element in a sorted matrix

/*Given a sorted matrix mat[n][m] and an element ‘x’. 
 * Find the position of x in the matrix if it is present, 
 * else print -1. Matrix is sorted in a way such that all 
 * elements in a row are sorted in increasing order and 
 * for row ‘i’, where 1 <= i <= n-1, the first element of 
 * row ‘i’ is greater than or equal to the last element of 
 * row ‘i-1’. The approach should have O(log n + log m) 
 * time complexity.*/

public class searchInSortedMatrix {

	public static void main(String[] args) {
		
		 int arr[][] = { { 0, 6, 8, 9, 11 },
                 { 20, 22, 28, 29, 31 },
                 { 36, 38, 50, 61, 63 },
                 { 64, 66, 100, 122, 128 } };
		 int k = 31;
		 int n = arr.length;
		 int m = arr[0].length;
		 
		 findRow(arr, n, m, k);
	}

	private static void findRow(int[][] arr, int n, int m, int k) {

		int l = 0, r = n-1, mid;
		
		while(l <= r) {
			
			mid = (l+r)/2;
			
			if(arr[mid][0] == k) {
				System.out.println("Fount at (" + mid + ", 0)");
				return;
			}
			
			if(arr[mid][m-1] == k) {
				int t = m-1;
				System.out.println("Fount at (" + mid + ", " + t + ")");
				return;
			}
			
			if(k > arr[mid][0] && k < arr[mid][m-1]) {
				binarySearch(arr, n, m, k, mid);
				return;
			}
			
			if(k < arr[mid][0]) 
				r = mid-1;
			
			if(k > arr[mid][m-1])
				l = mid+1;
		}
	}

	private static void binarySearch(int[][] arr, int n, int m, int k, int row) {

		int l = 0, r = m-1, mid;
		
		while(l <= r) {
			mid = (l+r)/2;
			
			if(arr[row][mid] == k) {
				System.out.println("Fount at (" + row + ", " + mid);
				return;
			}
			
			if(k < arr[row][mid])
				r = mid-1;
			
			if(k > arr[row][mid])
				l = mid+1;
		}
		System.out.println("Not Found");
	}
}