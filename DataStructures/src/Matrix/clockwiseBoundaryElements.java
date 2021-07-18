package Matrix;

//Print boundary elements of a given matrix in clockwise manner

/*Given a matrix arr[][] of size N * M, the task is to print the 
 * boundary elements of the given matrix in a clockwise form.*/

public class clockwiseBoundaryElements {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
		
		boundaryTraversal(arr);
	}

	private static void boundaryTraversal(int[][] arr) {
		
		int n = arr.length;
		int m = arr[0].length;
		
		for(int i = 0; i < m; i++) 
			System.out.print(arr[0][i] + " ");
		
		for(int i = 1; i < n; i++)
			System.out.print(arr[i][m-1] + " ");
		
		if(n > 1) {
			for(int i = m-2; i >= 0; i--)
				System.out.print(arr[n-1][i] + " ");
		}
		
		if(m > 1) {
			for(int i = n-2; i > 0; i--)
				System.out.print(arr[i][0] + " ");
		}
	}
}