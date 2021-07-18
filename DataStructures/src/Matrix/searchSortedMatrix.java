package Matrix;

//Search in a row wise and column wise sorted matrix

/*Given an n x n matrix and a number x, find the position of 
 * x in the matrix if it is present in it. Otherwise, print “Not Found”. 
 * In the given matrix, every row and column is sorted in increasing order. 
 * The designed algorithm should have linear time complexity. */

public class searchSortedMatrix {

	public static void main(String[] args) {
		
		int[][] arr = {{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}};

		int k = 63;
		int n = arr.length;
		int m = arr[0].length;
		
		search(arr, n, m, k);
	}
	
	private static void search(int[][] arr, int n, int m, int k) {
		
		int i = 0;
		int j = m-1;
		
		while(i<n && j>=0) {
			
			if(arr[i][j] == k) {
				System.out.println(i + " , " + j);
				return;
			}
			
			if(arr[i][j] > k) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println("not found");
	}
}