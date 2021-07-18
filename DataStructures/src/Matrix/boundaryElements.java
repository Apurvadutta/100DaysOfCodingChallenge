package Matrix;

//Boundary elements of a Matrix

/*Given a matrix of size n x m. Print the boundary elements of 
 * the matrix. Boundary elements are those elements which are 
 * not surrounded by elements on all four directions, 
 * i.e. elements in first row, first column, last row and last column. */

public class boundaryElements {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 } };
		
		printBoundary(arr);
	}

	private static void printBoundary(int[][] arr) {

		int n = arr.length;
		int m = arr[0].length;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < m; j++) {
				
				if(i == 0)
					System.out.print(arr[i][j] + " ");
				
				else if(i == m-1)
					System.out.print(arr[i][j] + " ");
				
				else if(j == 0)
					System.out.print(arr[i][j] + " ");
				
				else if(j == n-1)
					System.out.print(arr[i][j] + " ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}