package Arrays;
import java.util.*;
import java.io.*;
public class arrayManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] arr = new long[n+2];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			arr[a] = arr[a] + k;
			arr[b+1] = arr[b+1] - k;
		}
		long max = 0;
		long sum = 0;
		for(int j = 1; j <= n; j++) {
			sum = sum + arr[j];
			if(sum > max) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
