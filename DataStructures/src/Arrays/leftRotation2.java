package Arrays;

import java.util.Scanner;

public class leftRotation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] sort_arr = new int[n];
		int i =0;
		int rot_idx = d;
		while(rot_idx < n) {
			sort_arr[i] = arr[rot_idx];
			i++;
			rot_idx++;
		}
		rot_idx = 0;
		while(rot_idx < d) {
			sort_arr[i] = arr[rot_idx];
			i++;
			rot_idx++;
		}
		for(int k = 0; k < n; k++) {
			System.out.print(sort_arr[k] + " ");
		}
	}

}
