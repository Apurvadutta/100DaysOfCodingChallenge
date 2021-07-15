package Arrays;

//Adding one to number represented as array of digits.

/*Given a non-negative number represented as an array of digits, 
 * add 1 to the number ( increment the number represented by the digits ). 
 * The digits are stored such that the most significant digit is first 
 * element of array.*/

public class plusOne {
	
	public static int[] addOne(int[] arr, int n) {
		
		for(int i = n-1; i >= 0; i--) {
			
			if(arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		
		int[] newNum = new int[n+1];
		newNum[0] = 1;
		return newNum;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {9,9,9,9};
		int n = arr.length;
		
		int newArr[] = new int[n];	
		newArr = addOne(arr, n);
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}		
	}
}
