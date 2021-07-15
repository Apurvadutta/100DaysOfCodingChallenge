package java_DSA_Bootcamp;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int[] nums = {1,9,2,34,4,5};
		System.out.println(Arrays.toString(nums));
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	public static void bubbleSort(int[] nums) {
		for(int i =0; i<nums.length; i++) {
			for(int j = 0; j<nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					swap(nums, j, j+1);
				}
			}
		}
	}
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
