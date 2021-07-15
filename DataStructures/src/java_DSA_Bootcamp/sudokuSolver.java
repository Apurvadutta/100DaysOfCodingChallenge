package java_DSA_Bootcamp;

import java.util.Arrays;

public class sudokuSolver {

	public static void main(String[] args) {
		 int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                 { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                 { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                 { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                 { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                 { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                 { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                 { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                 { 0, 0, 5, 2, 0, 6, 3, 0, 0 } }; 
		 sudoku(grid, 0, 0);
	}
	
	public static void sudoku(int[][] grid, int row, int col) {
		if(row == 9) {
			for(int i = 0; i < 9; i++) {
				System.out.println(Arrays.toString(grid[i]));
			}
			return;
		}
		if(col == 9) {
			sudoku(grid, row + 1, 0);
			return;
		}
		if(grid[row][col] == 0) {
			for(int i = 1; i <= 9; i++) {
				if(isSafe(grid, row, col, i)) {
					grid[row][col] = i;
					sudoku(grid, row, col+1);
					grid[row][col] = 0;
				}
			}
		}else {
			sudoku(grid, row, col+1);
		}
		
	}
    public static boolean isSafe(int[][] grid, int row, int col, int value) {
		for(int c = 0; c < 9; c++) {
			if(grid[row][c] == value) {
				return false;
			}
		}
		for(int r = 0; r < 9; r++) {
			if(grid[r][col] == value) {
				return false;
			}
		}
		int rowChunk = row/3;
		int colChunk = col/3;
		for(int r = rowChunk*3; r < (rowChunk+1)*3; r++) {
			for(int c = colChunk*3; c < (colChunk+1)*3; c++) {
				if(grid[r][c] == value) {
					return false;
				}
			}
		}
		return true;
    }

}





