package Arrays;
import java.util.*;
import java.io.*;
public class hourglass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int l = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[l][b];
		System.out.println("Enter the elements in the array");
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int max = 0;
		int sum = 0;
		for(int i = 0; i < l-2; i++) {
			for(int j = 0; j < b-2; j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
						arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + 
						arr[i+2][j+2];
				if(sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
		
	}

}
