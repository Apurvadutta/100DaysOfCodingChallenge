package Arrays;

// A Product Array Puzzle.

/*Given an array arr[] of n integers, construct a Product Array 
 * prod[] (of same size) such that prod[i] is equal to the product 
 * of all the elements of arr[] except arr[i]. Solve it without 
 * division operator in O(n) time.*/

public class productArrayPuzzle {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5};
		int[] outputArr = productExceptSelf(num);
		
		for(int i = 0; i < outputArr.length; i++) {
			System.out.print(outputArr[i] + ", ");
		}
	}

	private static int[] productExceptSelf(int[] num) {
		
		int N = num.length;
		
		int[] leftProducts = new int[N];
		int[] rightProducts = new int[N];
		
		int[] outputArr = new int[N];
		
		leftProducts[0] = 1;
		rightProducts[N-1] = 1;
		
		for(int i = 1; i < N; i++) {
			leftProducts[i] = leftProducts[i-1]*num[i-1]; 
		}
		
		for(int i = N-2; i >= 0; i--) {
			rightProducts[i] = rightProducts[i+1]*num[i+1]; 
		}
		
		for(int i = 0; i < N; i++) {
			outputArr[i] = leftProducts[i]*rightProducts[i]; 
		}
		
		return outputArr;
	}

}