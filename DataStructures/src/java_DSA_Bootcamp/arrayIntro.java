package java_DSA_Bootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class arrayIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = {1,6,7,4,3,8};
//		int[] num = new int[5];
//		for(int i = 0; i<num.length; i++) {
//			num[i] = sc.nextInt();
//		}
		//System.out.println(Arrays.toString(num));
		int elt = 8;
		int ind = linearSearch(num, elt);
		System.out.println(ind);
	}
	public static int linearSearch(int[] num, int elt) {
		for(int i = 0; i<num.length; i++) {
			if(num[i] == elt) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] num, int elt) {
		int start = 0, end = num.length-1;
		while(start<=end) {
			int mid = (start + end)/2;
			if(num[mid] == elt) {
				return mid;
			}else if(num[mid] < elt) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}
	public static int maxElement(int[] num) {
		int maxInd = 0;
		for(int i = 1; i<num.length; i++) {
			if(num[maxInd] < num[i]) {
				 maxInd = i;				 
			}
		}
		return maxInd;
	}

}
