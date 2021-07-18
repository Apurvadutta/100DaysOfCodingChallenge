package Matrix;

// Sort a 2D vector diagonally.

/*Given a 2D vector of NxM integers. The task is to sort the 
 * elements of the vectors diagonally from top-left to 
 * bottom-right in decreasing order.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortDiagnolly {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of rows in matrix :");
		int row = sc.nextInt();
		
		System.out.println("Enter no. of columns in matrix :");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		System.out.println("Enter the values in matrix :");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Given matrix:");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");		
				}
			System.out.println();
	     }
		
		sortDiagnol(arr);
		
		System.out.println("Diagnolly sorted matrix :");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");		
				}
			System.out.println();
	     }
	}

	private static int[][] sortDiagnol(int[][] arr) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		for(int col = 0; col < m; col++) {
			sort(arr, 0, col, m, n);
		}
		for(int row = 1; row < n; row++) {
			sort(arr, row, 0, m, n);
		}
		return arr;
	}

	private static void sort(int[][] arr, int row, int col, int m, int n) {
		
		int r = row;
		int c = col;
		
		ArrayList<Integer> values = new ArrayList<>();
		
		while(r < m && c < n) {
			values.add(arr[r][c]);
			r++;
			c++;
		}
		
		r = row;
		c = col;
		
		Collections.sort(values);
		
		int ind = 0;
		while(r < m && c < n) {
			arr[r][c] = values.get(ind);
			ind++;
			r++;
			c++;
		}
	}
}
