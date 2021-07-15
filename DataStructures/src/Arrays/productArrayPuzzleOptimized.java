package Arrays;

//A Product Array Puzzle with constant Space Complexity.

/*Given an array arr[] of n integers, construct a Product Array 
* prod[] (of same size) such that prod[i] is equal to the product 
* of all the elements of arr[] except arr[i]. Solve it without 
* division operator in O(n) time.*/

public class productArrayPuzzleOptimized {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5};
		
		int[] outputArr = productExceptSelf(num);
		
		for(int i = 0; i < outputArr.length; i++) {
			System.out.print(outputArr[i] + ", ");
		}

	}
	
	private static int[] productExceptSelf(int[] num) {
		
		int N = num.length;
		
		int[] outputArr = new int[N];
		
		outputArr[0] = 1;
		
		for(int i = 1; i < N; i++) {
			outputArr[i] = 	outputArr[i-1]*num[i-1]; 
		}
		
		int R = 1;
		
		for(int i = N-1; i >= 0; i--) {
			outputArr[i] = 	outputArr[i]*R;
			R = R*num[i]; 
		}
		
		return outputArr;
	}

}
