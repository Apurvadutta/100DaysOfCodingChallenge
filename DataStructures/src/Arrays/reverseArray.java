package Arrays;
import java.util.*;
import java.io.*;

public class reverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int j = 0; j < n/2; j++) {
				temp = arr[j];
				arr[j] = arr[n-j-1];
				arr[n-j-1] = temp;
			}
		for(int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}
		

	}

}
