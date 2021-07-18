package Matrix;

//Finding sum of boundary elements

/*Given an matrix of size n x m. Find the sum of boundary elements of the 
 * matrix. Boundary elements are those elements which is not surrounded by 
 * elements on all four directions, i.e. elements in first row, first column, 
 * last row and last column. */

public class sumOfBoundaryElements {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 } };
		
		int sum = boundarySum(arr);
		
		System.out.println("Sum of all the boundary elements is: " + sum);
	}

	private static int boundarySum(int[][] arr) {

		int n = arr.length;
		int m = arr[0].length;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < m; j++) {
				
				if(i == 0)
					sum += arr[i][j];
				
				else if(i == n-1)
					sum += arr[i][j];
				
				else if(j == 0)
					sum += arr[i][j];
				
				else if(j == m-1)
					sum += arr[i][j];
			}
		}
		return sum;
	}
}