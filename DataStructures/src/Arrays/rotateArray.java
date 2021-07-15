package Arrays;
//Program for array rotation
/*Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements. */
public class rotateArray {
	public static void main(String[] args) {	
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int d = 4;
		int n = arr.length;
		int[] rotArr = rotateArr(arr, d, n);
		for(int i = 0; i < n; i++) {
			System.out.print(rotArr[i]);
		}
	}
	private static int[] rotateArr(int[] arr, int d, int n) {
		int[] rotatedArr = new int[n];
		int k = 0;
		for(int i = d; i < n; i++) {
			rotatedArr[k] = arr[i];
			k++;
		}
		for(int i = 0; i < d; i++) {
			rotatedArr[k] = arr[i];
			k++;
		}
		return rotatedArr;
	}
}
