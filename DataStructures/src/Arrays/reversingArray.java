package Arrays;
import java.util.*;
import java.io.*;

public class reversingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i = n-1; i >= 0; i--) {
			arr[i] = sc.nextInt();
		}
		for(int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}
	}

}
